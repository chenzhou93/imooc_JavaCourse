package com.imooc.model;

public class Student {
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	
	public Student() {
		
	}
	
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentAge(studentAge);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentName(studentName);
	}
	
	
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentAge(studentAge);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentName(studentName);
		this.setStudentSubject(studentSubject);
	}
	

	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(String studentSex) {
		if(studentSex.equals("M") || studentSex.equals("F")) {
			this.studentSex = studentSex;
		}else {
			this.studentSex = "M";
		}
		
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		if(studentAge <= 100 && studentAge > 0) {
			this.studentAge = studentAge;
		}else {
			this.studentAge = 18;
		}
		
	}
	
	public Subject getStudentSubject() {
		if(this.studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}



	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}



	public String introduction() {
		String str = "学生信息如下: \n姓名："
				+this.getStudentName() + "\n学号：" 
				+ this.getStudentNo() 
				+ "\n性别：" + this.getStudentSex() 
				+ "\n年龄：" + this.getStudentAge()
				+ "\n专业名称：" + this.getStudentSubject().getSubjectName()
				+ "\n学制年限：" + this.getStudentSubject().getSubjectNo();
		return str;
	}
	
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下: \n姓名："
				+this.getStudentName() + "\n学号：" 
				+ this.getStudentNo() 
				+ "\n性别：" + this.getStudentSex() 
				+ "\n年龄：" + this.getStudentAge()
				+ "\n专业名称：" + subjectName
				+ "\n学制年限：" + subjectLife;
		return str;
	}
	
	public String introduction(Subject mySubject) {
		String str = "学生信息如下: \n姓名："
				+this.getStudentName() + "\n学号：" 
				+ this.getStudentNo() 
				+ "\n性别：" + this.getStudentSex() 
				+ "\n年龄：" + this.getStudentAge()
				+ "\n专业名称：" + mySubject.getSubjectName()
				+ "\n学制年限：" + mySubject.getSubjectLife();
		return str;
	}
	
	
}
