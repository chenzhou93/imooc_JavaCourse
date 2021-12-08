package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods g1 = new Goods("s00001", "phone", 2000);
		Goods g2 = new Goods("s00002", "refridge", 5000);
		Goods g3 = new Goods("s00003", "tv", 3000);
		
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(g1);
		goodsList.add(g2);
		goodsList.add(g3);
		
		System.out.println("before sort");
		for(Goods good : goodsList) {
			System.out.println(good);
		}
		
		Collections.sort(goodsList);
		
		
		System.out.println("after sort");
		for(Goods good : goodsList) {
			System.out.println(good);
		}

	}

}
