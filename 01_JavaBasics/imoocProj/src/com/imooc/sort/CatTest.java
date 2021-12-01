package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// Sort cat name ascending
		
		Cat huahua = new Cat("huahua", 5, "British short hair");
		Cat fanfan = new Cat("fanfan", 2, "TYM");
		Cat maomao = new Cat("maomao", 3, "TYM");
		
		List<Cat> catList = new ArrayList<>();
		catList.add(huahua);
		catList.add(fanfan);
		catList.add(maomao);
		
		System.out.println("before sort");
		for(Cat cat : catList) {
			System.out.println(cat);
		}
		
		Collections.sort(catList, new NameComparator());
		
		System.out.println("after sort");
		for(Cat cat : catList) {
			System.out.println(cat);
		}
		
		Collections.sort(catList, new AgeComparator());
		
		System.out.println("after sort by age");
		for(Cat cat : catList) {
			System.out.println(cat);
		}

	}

}
