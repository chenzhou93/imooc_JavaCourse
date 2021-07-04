package com.imooc.program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrades {
	
	public void displayMenu() {
		System.out.println("********************************");
		System.out.println("       1--初始化数学成绩       	");
		System.out.println("       2--求成绩的平均值    		");
		System.out.println("       3--统计成绩大于85分的人数   ");
		System.out.println("       4--修改指定位置处的成绩     ");
		System.out.println("       5--打印输出所有成绩      	");
		System.out.println("       0--退出      				");
		System.out.println("********************************");
	}
	
	public float[] initScore() {
		Scanner sc = new Scanner(System.in);
		
		float[] result = new float[5];
		for(int i=0; i<5; i++) {
			System.out.println("请输入第"+(i+1)+"个数据:");
			try {
				result[i] = sc.nextFloat();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字!");
				sc.next();//接收错误数据
				i--;//输错了重新输
			}
		}
		return result;
	}
	
	public float average(float[] f) { 
		float avg = 0.0f;
		float sum = 0.0f;
		for(int i=0; i<f.length; i++) {
			sum += f[i];
		}
		avg = sum/f.length;
		return avg;
	}
	
	public int count(float[] f) { 
		int cnt = 0;
		for(int i=0; i<f.length; i++) {
			if(f[i] > 85) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public void update(float[] f, int index, float newScore) { 
		if(f == null || index > f.length || newScore > 100 || newScore < 0) {
			System.out.println("数据有误");
			return;
		}
		f[index] = newScore;
	}
	
	public void displayAllScore(float[] f) { 
		System.out.println("成绩为:");
		for(int i=0; i<f.length; i++) {
			System.out.print(f[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StudentGrades sg = new StudentGrades();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		float[] f = null;
		int index = 0;
		float num = 0;
		while(true) {
			sg.displayMenu();
			System.out.println("请输入对应的数字进行操作:");
			try {
				input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入格式有误，不能有非数字");
				sc.next();
				continue;
			}
			if(input == 0) {
				System.out.println("退出程序！");
				break;
			}
			switch(input) {
				case 1:
					f = sg.initScore();
					break;
				case 2:
					if(f != null) {
						float avg = sg.average(f);
						System.out.println("数学平均成绩为：" + avg);
					}else {
						System.out.println("还未在数组中插入数据，请重新选择操作");
					}
					break;
				case 3:
					if(f != null) {
						int cnt = sg.count(f);
						System.out.println("成绩大于85分的人数为：" + cnt);
					}else {
						System.out.println("还未在数组中插入数据，请重新选择操作");
					}
					break;
				case 4:
					if(f != null) {
						System.out.println("修改前：");
						sg.displayAllScore(f);
						try {
							System.out.println("请输入要修改数据的位置：");
							index = sc.nextInt();
							System.out.println("请输入新数据：");
							num = sc.nextInt();
							sg.update(f, index, num);
							System.out.println("修改后: ");
							sg.displayAllScore(f);
						}catch(InputMismatchException e) {
							System.out.println("输入格式有误，不能有非数字");
							sc.next();
							break;
						}
					}else {
						System.out.println("还未在数组中插入数据，请重新选择操作");
					}
					break;
				case 5:
					if(f != null) {
						sg.displayAllScore(f);
					}else {
						System.out.println("还未在数组中插入数据，请重新选择操作");
					}
					break;
			}
		}

	}

}
