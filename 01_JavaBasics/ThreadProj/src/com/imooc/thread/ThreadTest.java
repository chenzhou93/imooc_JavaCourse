package com.imooc.thread;
class MyThread extends Thread{
	public void run() {
		System.out.println(getName() + "thread is running");
	}
}
public class ThreadTest {
	
	
	public static void main(String[] args) {
		System.out.println("main thread 1");
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("main thread 2");
	}

}
