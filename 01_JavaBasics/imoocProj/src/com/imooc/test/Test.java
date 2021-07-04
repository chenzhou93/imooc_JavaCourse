package com.imooc.test;
//import com.imooc.animal.*;
import com.imooc.animal.Cat;
import com.imooc.machanics.*;//都有cat，产生歧义

import com.imooc.*;//只能加载这个包下直接管理的类，此时没有类，只有三个包，不会逐个查找子包里面的内容

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat();//此时cat为animal里的cat
		//先找能直接解析的类
		//com.imooc.animal.CatTest
		com.imooc.animal.CatTest catTest = new com.imooc.animal.CatTest();
		
		com.imooc.machanics.Cat cat1 = new com.imooc.machanics.Cat();
	}
}
