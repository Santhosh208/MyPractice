package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>();
		for(int i=1; i<=100; i++) {
			l.add(i);
		}
		l.forEach(i-> System.out.print(i+" "));
	}

}
