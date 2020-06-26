/**
 * Thread joining demo. If another thread is joined, it will wait until that thread to finish before terminating itself.
 */
package com.rajib.join;

/**
 * @author rajib
 *
 */
public class JoinDemo extends Thread {

	public static long counter = 0;

	public void run() {

		while (true) {
			if (counter == 100000)
				return;
			counter++;
		}
	}

	public static void main(String[] args) {

		JoinDemo toJoin = new JoinDemo();
		toJoin.start();

		try {
			toJoin.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Counted up to " + counter);
	}
}
