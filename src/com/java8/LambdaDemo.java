package com.java8;
interface Lamda{
	void show(int i ,String s);
}
public class LambdaDemo {
	public static void main(String[] args) {
		Lamda l;
		l = (int i, String s) -> System.out.println("hello"+ " "+i+" "+s);
		l.show(25,"Santhosh");
		
	}

}
