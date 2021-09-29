package com.imooc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.imooc.set.Goods;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		//Define hashmap object
		Map<String, Goods> goodsMap = new HashMap<String, Goods>();
		
		int i=0;
		while(i<3) {
			System.out.println("please input " + (i+1) + " product");
			System.out.println("please input product id");
			String goodsId = console.next();
			System.out.println("please input goods name: ");
			String goodsName = console.next();
			System.out.println("please input goods price: ");
			double goodsPrice = console.nextDouble();
			
			Goods goods = new Goods(goodsId, goodsName, goodsPrice);
			goodsMap.put(goodsId, goods);
			
			i++;
		}
		
		//Iterate map, output product info
		System.out.println("all product info");
		Iterator<Goods>itGoods = goodsMap.values().iterator();
		
		while(itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
	}

}
