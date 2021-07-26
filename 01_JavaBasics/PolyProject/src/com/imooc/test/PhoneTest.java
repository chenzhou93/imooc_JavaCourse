package com.imooc.test;

import com.imooc.tel.Camera;
import com.imooc.tel.FourthGenPhone;
import com.imooc.tel.INet;
import com.imooc.tel.IPhoto;
import com.imooc.tel.SmartWatch;

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
		System.out.println("================");
		//INet.TEMP = 33;
		System.out.println(INet.TEMP);
		System.out.println("================");
		
		INet net = new SmartWatch();
		System.out.println(net.TEMP);
		
		SmartWatch sw = new SmartWatch();
		System.out.println(sw.TEMP);
		
		INet.stop();
		System.out.println("================");
		INet net2 = new SmartWatch();
		net2.connection();
		
		IPhoto ip2 = new SmartWatch();
		ip2.connection();
		
		System.out.println("================");
		INet net3 = new FourthGenPhone();
		net3.connection();
		
		IPhoto ip3 = new FourthGenPhone();
		ip3.connection();
		
	}

}
