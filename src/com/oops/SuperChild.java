package com.oops;

public class SuperChild extends Superparent {

	int speed = 100;

	public void display() {
		System.out.println(speed);
		System.out.println(super.speed);
		super.test();
	}

	public static void main(String[] args) {
		SuperChild sc= new SuperChild();
		sc.display();

	}

}
