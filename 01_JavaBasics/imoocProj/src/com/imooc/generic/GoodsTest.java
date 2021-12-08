package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		//Create Book
		//List<Book> books = new ArrayList<Book>();
		//List<Goods> books = new ArrayList<Goods>();
		List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());
		
		//Create Clothes
		List<Clothes> clothes = new ArrayList<>();
		clothes.add(new Clothes());
		clothes.add(new Clothes());
		
		//Create Shoes
		List<Shoes> shoes = new ArrayList<>();
		shoes.add(new Shoes());
		shoes.add(new Shoes());
		
		GoodsSeller goodsSeller = new GoodsSeller();
		goodsSeller.sellGoods(books);
	}

}
