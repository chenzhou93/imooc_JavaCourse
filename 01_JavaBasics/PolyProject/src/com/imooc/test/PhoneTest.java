package com.imooc.test;

import com.imooc.tel.Camera;
import com.imooc.tel.FourthGenPhone;
import com.imooc.tel.IPhoto;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourthGenPhone phone = new FourthGenPhone();
		phone.call();
		phone.message();
		phone.video();
		phone.music();
		phone.photo();
		phone.network();
		
		System.out.println("================");
		IPhoto ip = new FourthGenPhone();
		ip.photo();
		
		ip = new Camera();
		ip.photo();
	}

}
