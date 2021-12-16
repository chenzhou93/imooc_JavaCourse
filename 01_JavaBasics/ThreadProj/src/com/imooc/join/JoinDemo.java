package com.imooc.join;

class MyThread extends Thread{
	public void run() {
		for(int i=0; i<15; i++) {
			System.out.println(getName() + " thread is running " + i);
		}
		
//		for(int i=0; i<1500; i++) {
//			System.out.println(getName() + " thread is running " + i);
//		}
		
	}
}
public class JoinDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join();
			//mt.join(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("main thread runs " + i);
		}
		System.out.println("main thread ends");
	}

}
