package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub1 = new Subject("计算机科学与应用", "J0001", 4);
		System.out.println(sub1.info());
		System.out.println("===========================");
		
		//Test Student
		Student stu1 = new Student("S01", "ZHANGSAN", "M", 21);
		Student stu11 = new Student("S01", "ZHANGSAN", "M", 21, sub1);
		System.out.println(stu1.introduction());
		System.out.println(stu11.introduction());
		
		System.out.println("===========================");
		Student stu2 = new Student("S02", "LISI", "F", 17);
		System.out.println(stu2.introduction("计算机科学与应用", 4));
		
		System.out.println("===========================");
		Student stu3 = new Student("S02", "WANGWU", "M", 18);
		System.out.println(stu3.introduction(sub1));
		
	}

}
