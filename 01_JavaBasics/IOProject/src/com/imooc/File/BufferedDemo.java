package com.imooc.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("imooc.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("imooc.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			//写入了缓冲区，缓冲区未满
			bos.write(50);
			bos.write('a');
			//强制清空，写入文件
			bos.flush();
			//close() 也可以清空数据
			//bos.close();
			
			/*****************READ***********************/
			System.out.println(bis.read());
			System.out.println((char)bis.read());
			fos.close();
			fis.close();
			bis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
