package com.imooc.string;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		// TODO Auto-generated method stub
		
		String str = new String("java program basics");
		
		//Convert to Byte
		byte[] arrByte = str.getBytes();
		
		for(int i=0; i<arrByte.length; i++) {
			System.out.print(arrByte[i] + " ");
		}
		System.out.println();
		
		//byte -> string
		String str1 = new String(arrByte);
		System.out.println(str1);
		
		String str2 = new String(arrByte, "GBK");//汉字输出为乱码，
		//byte[] arrByte = str.getBytes("GBK");
		System.out.println(str2);
	}

}
