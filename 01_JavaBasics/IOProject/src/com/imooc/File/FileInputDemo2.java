package com.imooc.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("imooc.txt");
			byte[] b = new byte[100];
			
			//fis.read(b); //Hello,imooc!
			fis.read(b,0,5); //Hello
			System.out.println(new String(b));
			
			fis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
