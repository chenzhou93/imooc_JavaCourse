package com.imooc.queue;

public class Queue {
	private int n;
	boolean flag = false;
	
	public synchronized int getN() {
		System.out.println("consume: " + n);
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = false;//消费完毕，容器中没有数据
		notifyAll();
		return n;
	}

	public synchronized void setN(int n) {
		System.out.println("produce: " + n);
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		flag = true;
		notifyAll();
	}
	
}
