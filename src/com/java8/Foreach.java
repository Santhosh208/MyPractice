package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>();
		
		l.add(35);
		l.add(25);
		l.add(15);
		l.add(89);
		l.add(38);
		l.add(10);
		
		
		
		l.forEach(i ->System.out.println(i));
	}

}
