package com.imooc.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "javA program basic, I love java";
		
		//Find 'A'
		System.out.println(str.indexOf('A'));
		
		
		//find sub-string
		System.out.println(str.indexOf("basic"));
		
		System.out.println(str.lastIndexOf('A'));
		
		System.out.println(str.lastIndexOf("ram"));
		
		System.out.println(str.indexOf("jav", 8));
		
	}

}
