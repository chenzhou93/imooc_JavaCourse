package com.imooc.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fos = new FileOutputStream("imooc.txt");
			fis = new FileInputStream("imooc.txt");
			fos.write(50);
			fos.write('a');
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
