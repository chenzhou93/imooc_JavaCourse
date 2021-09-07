package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		
		System.out.println("集合中的元素为: ");
		Iterator it = set.iterator();
		//遍历迭代器并输出元素
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		set.add("white");//插入失败 但是不会报错
		
	}

}
