package com.imooc.SchoolManagementSystem;

import java.util.Scanner;

public class TestDemo {

	//班级的测试方法：
	public void testBanJi(){
		
	}

    //学校的测试方法：
	public void testSchool(){
		
	}

    //主菜单： 
	public void mainMenu(){
		System.out.println("*********************************");
		System.out.println("***************主菜单**************");
		System.out.println("*************1--班级管理**********");
		System.out.println("*************2--学校管理**************");
		System.out.println("*************0--退出***************");
		System.out.println("*********************************");
	}

    //学校管理菜单：
	public void schoolMenu(){
		
	}

    //班级管理菜单：
	public void banJiMenu(){
		
	}

    //主流程：
	public void test(){
		mainMenu();
		System.out.println("请输入对应数字进行列表管理");
		Scanner s = new Scanner(System.in);
		int command = s.nextInt();
		switch(command) {
			case 1:
				banJiMenu();
				break;
			case 2:
				schoolMenu();
				break;
			case 0:
				break;
			default:
				break;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
