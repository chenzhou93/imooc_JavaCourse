package com.imooc.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Banji {
	private String classId;
	private String className;
	private List<Student> stuList;
	
	public Banji() {
		super();
		this.stuList = new ArrayList<Student>();
	}
	
	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	public Banji(String classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
		this.stuList = new ArrayList<Student>();
	}
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	//将学生添加到班级：
	public void addStudent(Student stu){
		Boolean flag = false;
		for(Student std : stuList) {
			if(std.equals(stu)){
				flag = true;
				System.out.println("该学生已经存在");
				break;
			}
		}
		if(!flag) {
			stuList.add(stu);
		}
	}

    //通过学号查询学生在班级中是否存在： 
	public Student searchStudentByNum(String stuNum){
		for(Student std : stuList) {
			if(std.getStuName().equals(stuNum)){
				return std;
			}
		}
		return null;
	}

    //输入班级学生的语文成绩：
	public void insertChineseScore(String stuNum,float score){
		Student std = searchStudentByNum(stuNum);
		if(std != null) {
			std.setChinese(score);
		}
	}

    //输入班级学生的数学成绩：
	public void insertMathScore(String stuNum,float score){
		Student std = searchStudentByNum(stuNum);
		if(std != null) {
			std.setMath(score);
		}
	}

    //删除学生信息：
	public void deleteStudent(String stuNum){
		Student std = searchStudentByNum(stuNum);
		if(std != null) {
			stuList.remove(std);
		}
	}

    //显示所有学生的信息（包括学号和姓名）：
	public void displayAllStudent(){
		for(Student s : stuList) {
			System.out.println(s);
		}
	}
	
}
