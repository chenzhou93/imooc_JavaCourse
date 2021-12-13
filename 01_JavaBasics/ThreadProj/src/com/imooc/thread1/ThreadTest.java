package com.imooc.thread1;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(getName() + " is running " + i);
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("Thread1");
		MyThread mt2 = new MyThread("Thread2");
		mt1.start();
		mt2.start();

	}

}
