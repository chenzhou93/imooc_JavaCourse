package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("orange");
		list.add("blue");
		list.add("yellow");
		list.add("grey");
		
		System.out.println("Before sort");
		for(String s: list) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		Collections.sort(list);
		
		System.out.println("After sort");
		for(String s: list) {
			System.out.print(s + ", ");
		}
		System.out.println();

	}

}
