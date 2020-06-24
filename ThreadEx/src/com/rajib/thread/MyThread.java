package com.rajib.thread;

public class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 5; ++i) {
			System.out.println("Sl." + (i + 1) + " Thread ID: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());
		}
	}
}
