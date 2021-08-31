package com.imooc.set;
import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("java");
		list.add("C");
		list.add("c++");
		list.add("go");
		list.add("swift");
		
		System.out.println("size: " + list.size());
		System.out.println("********************");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println("********************");
		
		//list.remove(2);
		list.remove("c++");
		
		System.out.println("********************");
		System.out.println("after remove c++");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
	}

}
