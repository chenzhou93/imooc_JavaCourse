package com.imooc.generic;

import java.util.List;

public class GoodsSeller {
//	public void sellGoods(List<Goods> goods) {
//		//call sell method
//		for(Goods g : goods) {
//			g.sell();
//		}
//	}
	
	public void sellGoods(List<? extends Goods> goods) {
		//call sell method
		for(Goods g : goods) {
			g.sell();
		}
	}
}
