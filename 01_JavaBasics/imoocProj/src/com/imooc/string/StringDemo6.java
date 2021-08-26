package com.imooc.string;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string的不可变性 - 对象一旦被创建，则不能修改
		//修改-创建了新的对象，所指向的内存空间不变
		
		String s1 = "imooc";
		s1 = "hello, " + s1;
		//s1不再指向imooc所在的内存空间，而是指向了 "hello, imooc“
		
		String s2 = "hello," + s1;
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = new String("hello, imooc");
		System.out.println("sub" + s3.substring(0, 5));
		System.out.println("s3 " + s3);

	}

}
