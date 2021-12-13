package com.imooc.runnable;

class PrintRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName() + " is running.");
		int i=1;
		while(i<=10) {
			System.out.println(Thread.currentThread().getName() + " is running " + (i++));
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		// 适合多个线程处理同一个资源的情况
		PrintRunnable pr = new PrintRunnable();
		Thread tr = new Thread(pr);
		tr.start();
		
		PrintRunnable pr1 = new PrintRunnable();
		Thread tr1 = new Thread(pr1);
		tr1.start();
	}

}
