package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(1);
		
		System.out.println("Before sort");
		for(int n: list) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		//Sort
		Collections.sort(list);
		System.out.println("After sort");
		for(int n: list) {
			System.out.print(n + ", ");
		}
		System.out.println();

	}

}
