package com.java8;

interface Phone {
	void call();
	default void message() {
		System.out.println("message");
	}
	default void whatsapp() {
		System.out.println("whatsapp");
	}
	static void show() {
		System.out.println("hello show");
	}
}

class AndroidPhone implements Phone {

	public void call() {
		System.out.println("calling");

	}

}

public class DemoInterface {
	public static void main(String[] args) {
		Phone p= new AndroidPhone();
		p.call();
		p.message();
		Phone.show();
		p.whatsapp();
		
	}

}
