package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file1 = new File("/Users/chenzhou/Documents/Study/Computer Science Learning");
		
		//File file1 = new File("c:\\imooc", "io\\score.txt");
//		File file = new File("c:\\imooc");
//		File file1 = new File(file, "io\\score.txt");
		
		System.out.println("is directory: " + file1.isDirectory());
		System.out.println("is file: " + file1.isFile());
		
		//Create Directory
		File file2 = new File("/Users/chenzhou/Documents/Study/Computer Science Learning", "Test");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		
		//Create File
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
