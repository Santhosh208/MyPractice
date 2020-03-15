package com.collections;

import java.util.Comparator;

public class BrandComprator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop x, Laptop y) {
		
		return x.getBrand().compareTo(y.getBrand());
	}

}
