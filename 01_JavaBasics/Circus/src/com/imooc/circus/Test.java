package com.imooc.circus;

import java.util.Scanner;

public class Test {
	public static void displayMenu() {
		System.out.println("********欢迎来到太阳马戏团********");
		System.out.println("**********请选择表演者**********");
		System.out.println("**********  1、棕熊     **********");
		System.out.println("**********  2、狮子     **********");
		System.out.println("**********  3、猴子     **********");
		System.out.println("**********  4、鹦鹉     **********");
		System.out.println("**********  5、小丑     **********");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		displayMenu();
		int i = sc.nextInt();
	    while(i > 0) {
	    	switch(i) {
		    	case 1:
		    		Bear bear = new Bear("Bill", 1);
		    		bear.act();
		    		bear.skill();
		    		bear.describeHobby();
		    		break;
		    	case 2:
		    		Lion lion = new Lion("Lain", 2, "灰色", "公狮");
		    		lion.act();
		    		lion.skill();
		    		lion.describeHobby();
		    		break;
		    	case 3:
		    		Monkey monkey = new Monkey("Tom", 1, "金丝猴");
		    		monkey.act();
		    		monkey.skill();
		    		monkey.describeHobby();
		    		break;
		    	case 4:
		    		Parrot parrot = new Parrot("Rose", 1, "牡丹鹦鹉");
		    		parrot.act();
		    		parrot.skill();
		    		parrot.describeHobby();
		    		break;
		    	case 5:
		    		Clown clown = new Clown("", 0, "Kahle", 5);
		    		clown.act();
		    		clown.dress();
		    		clown.skill();
		    		break;
		    	default:
		    		break;
	    	}
	    	System.out.println("****** 是否继续观看（1/0） ******");
	    	int j = sc.nextInt();
	    	if(j == 0) {
	    		System.out.println("****** 欢迎下次光临 ******");
	    		break;
	    	}else if(j == 1) {
	    		displayMenu();
	    		i = sc.nextInt();
	    	}else {
	    		System.out.println("** 输入信息不正确，请重新输入 **");
	    		i = 10;
	    	}
	    	
	    }
	    sc.close();

	}

}
