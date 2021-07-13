package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Parent;

public class ParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		Cat one = new Cat();
		Dog two = new Dog();
		
		parent.feed(one);
		parent.feed(two);
		
		System.out.println("=======================");
		
		Boolean hasManyTime = true;
		Animal temp = parent.raise(hasManyTime);
		
//		if(hasManyTime) {
//			temp = parent.hasManyTime();
//		}else {
//			temp = parent.hasLittleTime();
//		}
	}

}
