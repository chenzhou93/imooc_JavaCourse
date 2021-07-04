package com.imooc;

public class VarDemo {

	public static void main(String[] args) {
		int x = 0, y = 0;
		System.out.println("x="+ x);
		System.out.println("y="+ y);
		
		//关于换行的问题
		System.out.print(x + " " + y);
		System.out.print(x + " " + y + '\n');
		//System.out.println();
		System.out.print(x + "," + y);
		
		System.out.print(x + '\t' + y + '\n'); //自动转化为整型进行加减法运算
		System.out.print("" + x + "\t" + y + "\n");
		
		//科学技术法表示浮点型数据
		double d = 1.23E5; //1.23 * 10^5
		float f = 1.23e5f;
		
		double d1 = .2;
	}

}
