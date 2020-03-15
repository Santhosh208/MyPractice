package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Laptop> l= new ArrayList<>();
		
		Laptop l1 = new Laptop("Lenovo", 4, 18000);
		Laptop l2 = new Laptop("HP", 8, 32000);
		Laptop l3 = new Laptop("Dell", 6, 28000);
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		
		//Collections.sort(l);
		Collections.sort(l, new BrandComprator());
		for(Laptop la:l) {
			System.out.println(la.price+" "+la.getBrand()+" "+la.ram);
		}
	}

}
