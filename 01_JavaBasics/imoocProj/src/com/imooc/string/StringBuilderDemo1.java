package com.imooc.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("hello");
		
		//在“hello”后面添加内容 -> "hello, imooc"
//		str.append(',');
//		str.append("imooc");
//		System.out.println(str);
		
		System.out.println(str.append(',').append("imooc"));
		
		//ALL CAP
		//1.使用delete 删除小写，再插入大写
		//System.out.println("after replacement: " + str.delete(7, 12).insert(7, "MOOC"));
		
		//2.使用replace方法直接替换
		System.out.println("after replacement: " + str.replace(7,12,"MOOC"));
		
		//3.在字符串中取出 hello 并输出
		System.out.println(str.substring(0,2));

	}

}
