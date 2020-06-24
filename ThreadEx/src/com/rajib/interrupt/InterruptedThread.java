/**
 * example of stopping a thread by sending interrupt instruction
 */
package com.rajib.interrupt;

/**
 * @author rajib
 *
 */
public class InterruptedThread implements Runnable {

	@Override
	public void run() {

		while (true) {
			System.out.println("Inside infinite loop of run method");

			if (Thread.interrupted()) {
				System.out.println("Thread interrupted!");
				return;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(new InterruptedThread());
		thread.start();

		Thread.sleep(100);
		thread.interrupt();
	}
}
