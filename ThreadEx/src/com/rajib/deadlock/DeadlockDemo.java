/**
 * testing deadlock
 */
package com.rajib.deadlock;

/**
 * @author rajib
 *
 */

class Deadlock{
	
	Object obj1 = new Object();
	Object obj2 = new Object();
}

public class DeadlockDemo {

	public static void main(String[] args) {
		
		Deadlock deadlock = new Deadlock();

		Thread thread1 = new Thread(() -> {
			synchronized (deadlock.obj1) {
				System.out.println("Thread 1 obj 1 locked");
				
				synchronized (deadlock.obj2) {
					System.out.println("Thread 1 obj 2 locked");
				}
			}
		});
		
		thread1.start();
		
		Thread thread2 = new Thread(() -> {
			synchronized (deadlock.obj2) {
				System.out.println("Thread 2 obj 2 locked");
				
				synchronized (deadlock.obj1) {
					System.out.println("Thread 2 obj 1 locked");
				}
			}
		});
		
		thread2.start();
	}

}
