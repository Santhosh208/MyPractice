package com.threads;

public class MyThread extends Thread {
	/*public void run(int k) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("thread over load");
		}
	}
*/
	public void run() {
		for (int i = 1; i <= 5; i++) {
			//System.out.println("my thread");
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setName("hello thread");
		}
	}

}
