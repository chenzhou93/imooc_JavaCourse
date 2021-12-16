package com.imooc.Priority;

class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name + " thread is running " + i);
		}
		
	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		int mainPriority = Thread.currentThread().getPriority();
		MyThread mt1 = new MyThread("XianCheng1");
		mt1.setPriority(10);

	}

}
