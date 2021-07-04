package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat("hh", 2, 1000, "bs");
		Cat two = new Cat();
		one.run();
		two.setName("Fan Fan");
		System.out.println(two.getName());
		two.setMonth(-3);
		if(two.getMonth() == 0)
			return;
		System.out.println(two.getMonth());
	}

}
