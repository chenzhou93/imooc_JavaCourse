package com.imooc.generic;

public class NumberGeneric<T> {
	private T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		NumberGeneric<Integer> intNum = new NumberGeneric<>();
		intNum.setNum(10);
		System.out.println("integer: " + intNum.getNum());
		
		NumberGeneric<Float> floatNum = new NumberGeneric<>();
		floatNum.setNum(10.0f);
		System.out.println("integer: " + floatNum.getNum());
	}
	
}
