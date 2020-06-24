/**
 * create and run a thread using Runnable interface
 */
package com.rajib.usingRunnable;

/**
 * @author rajib
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread using Runnable interface (anonymous inner class)");
			}
		});
		
		thread.start();
		
		//using lambda
		new Thread(()->{System.out.println("Thread using Runnable interface (lamda)");}).start();
		
		//some other task for default main thread
		for (int i = 0; i < 5; ++i) {
			System.out.println("Sl." + (i + 1) + " Thread ID: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());
		}
	}

}
