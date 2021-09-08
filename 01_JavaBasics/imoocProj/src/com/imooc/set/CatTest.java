package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat huahua = new Cat("huahua", 12, "shorthair");
		Cat fanfan = new Cat("fanfan", 3, "tyumao");
		
		Set set = new HashSet();
		set.add(huahua);
		set.add(fanfan);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Add another huahua
		Cat huahua1 = new Cat("huahua", 12, "shorthair");
		set.add(huahua1);
		
		System.out.println("******************************");
		
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Cat huahua2 = new Cat("huahua02", 2, "shorthair");
		set.add(huahua2);
		
		System.out.println("******************************");
		
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Search huahua
		if(set.contains(huahua)) {
			System.out.println("found huahua");
			System.out.println(huahua);
		}else {
			System.out.println("huahua not found");
		}
		
		boolean flag = false;
		Cat c = null;
		it = set.iterator();
		while(it.hasNext()) {
			c = (Cat)it.next();
			if(c.getName().equals("huahua")) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("found huahua");
			System.out.println(c);
		}else {
			System.out.println("huahua not found");
		}
	}

}
