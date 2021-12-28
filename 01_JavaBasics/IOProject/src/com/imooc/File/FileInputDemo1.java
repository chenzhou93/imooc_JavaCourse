package com.imooc.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {
	public static void main(String[] args) {
		//Create file input stream object
		try {
			FileInputStream fis = new FileInputStream("imooc.txt");
//			int n = fis.read();
//			System.out.println(n);
//			fis.close();

//			int n = fis.read();
//			while(n != -1) {
//				System.out.println((char)n);
//				n = fis.read();
//			}
			
			int n = 0;
			while((n=fis.read()) != -1) {
				System.out.print((char)n);
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}

