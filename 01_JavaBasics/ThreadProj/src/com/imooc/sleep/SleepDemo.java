package com.imooc.sleep;

class MyThread implements Runnable{
	public void run() {
		for(int i=1; i<=15; i++) {
			System.out.println(Thread.currentThread().getName() + " is running " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class SleepDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt1);
		t1.start();

	}

}
