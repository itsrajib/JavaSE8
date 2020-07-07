/**
 * testing deadlock
 */
package com.rajib.deadlock;

/**
 * @author rajib
 *
 */

public class DeadlockDemo {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();

		Thread thread1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println("Thread 1 obj 1 locked");
				
				synchronized (obj2) {
					System.out.println("Thread 1 obj 2 locked");
				}
			}
		});
		
		thread1.setName("Thread-1");
		thread1.start();
		
		Thread thread2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println("Thread 2 obj 2 locked");
				
				synchronized (obj1) {
					System.out.println("Thread 2 obj 1 locked");
				}
			}
		});
		
		thread2.setName("Thread-2");
		thread2.start();
	}

}
