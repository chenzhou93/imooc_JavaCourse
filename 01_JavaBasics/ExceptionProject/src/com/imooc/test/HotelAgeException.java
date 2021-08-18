package com.imooc.test;

public class HotelAgeException extends Exception{
	public HotelAgeException() {
		super("under 18 or over 60");
	}
}
