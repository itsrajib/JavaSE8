/**
 * create and run a simple thread
 */
package com.rajib.thread;

/**
 * @author rajib
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyThread thread = new MyThread();
		// thread.setName("MyThread");
		thread.start();

		for (int i = 0; i < 5; ++i) {
			System.out.println("Sl." + (i + 1) + " Thread ID: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());
		}
	}

}
