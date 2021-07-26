package com.imooc.tel;

public class FourthGenPhone extends ThirdGenPhone implements IPhoto, INet {
	@Override
	public void photo() {
		System.out.println("phone can photo");
	}
	public void network() {
		System.out.println("can network");
	}
	public void game() {
		System.out.println("can game");
	}
	
	public void connection() {
		System.out.println("4th phone connection");
	}
}
