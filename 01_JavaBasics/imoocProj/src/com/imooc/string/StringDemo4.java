package com.imooc.string;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//== and equals()
		
		String str1 = "imooc";
		String str2 = "imooc";
		String str3 = new String("imooc");
		
		//Content
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		//Address
		System.out.println(str1 == str2);//TRUE
		/*
		 * 栈 str1
		 * 常量池 "imooc"
		 * str2发现 "imooc"已经存在于常量池，直接指向
		 * 
		 * 堆 new出来的str3
		 * */
		System.out.println(str1 == str3);
		
	}

}
