package com.imooc.model;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;
	
	public Subject() {
		
	}
	
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.subjectName = subjectName;
		this.subjectNo = subjectNo;
		this.subjectLife = subjectLife;
	}
	
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
	}
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectLife() {
		return subjectLife;
	}
	public void setSubjectLife(int subjectLife) {
		if(subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/*
	 * @return 专业介绍相关信息，名称，编号，年限
	 * */
	
	public Student[] getMyStudents() {
		if(this.myStudents == null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	//返回string是因为将来输出不一定在控制台输出，可以在网页
	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n学制年限："
				+ this.getSubjectLife() + "年";
		
		return str;
	}
	
	public void addStudent(Student stu) {
		/*
		 * 1.将学生保存到数组中
		 * 2.将学生个数保存到studentNum
		 * */
		for(int i=0; i<this.getMyStudents().length; i++) {
			if(this.getMyStudents()[i] == null) {
				stu.setStudentSubject(this);
				this.getMyStudents()[i] = stu;
				this.studentNum = i+1;
				return;
			}
		}
		
	}
	
	
}
