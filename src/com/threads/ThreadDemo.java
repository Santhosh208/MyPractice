package com.threads;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread mt= new MyThread();
		MyRunnable mr = new MyRunnable();
		mt.start();
		//mt.run();
		mt.start();
		for(int i=1; i<=5; i++) {
			System.out.println("thread demo");
		}
	}
}
