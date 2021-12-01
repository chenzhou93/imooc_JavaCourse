package com.imooc.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		// TODO Auto-generated method stub
		
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		int n = name1.compareTo(name2); //ascending
		int n1 = name2.compareTo(name1); //descending
		
		return n;
	}
	
}
