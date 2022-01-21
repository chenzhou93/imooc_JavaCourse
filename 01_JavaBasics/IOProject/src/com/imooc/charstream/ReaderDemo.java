package com.imooc.charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;

public class ReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("imooc.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			
			FileOutputStream fos = new FileOutputStream("imooc1.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);

			int n = 0;
			char[] cbuf = new char[10];
			
			//1 - read
			while((n=isr.read()) != -1) {
				System.out.print((char)n);
			}
			
			//2 - read
			while((n=isr.read(cbuf)) != -1) {
				String s = new String(cbuf);
				System.out.println(s);
			}
			
			while((n=isr.read(cbuf)) != -1) {
				osw.write(cbuf, 0, n);
				
			}
			osw.flush();
			fis.close();
			fos.close();
			isr.close();
			osw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
