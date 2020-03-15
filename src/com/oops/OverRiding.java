package com.oops;

public class OverRiding extends OverLoading {
	 protected void test() {
		System.out.println("hello over riding");

	}
	public static void main(String[] args) {
		OverRiding or =new OverRiding();
		or.test();
	}

}
