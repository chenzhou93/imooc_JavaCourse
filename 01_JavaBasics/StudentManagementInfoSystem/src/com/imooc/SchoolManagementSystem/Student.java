package com.imooc.SchoolManagementSystem;

import java.util.Objects;

public class Student {
	private String stuNum;
	private String stuName;
	private float math;
	private float chinese;
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getChinese() {
		return chinese;
	}
	public void setChinese(float chinese) {
		this.chinese = chinese;
	}
	@Override
	public int hashCode() {
		return Objects.hash(chinese, math, stuName, stuNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return chinese == other.chinese
				&& math == other.math
				&& stuName.equals(other.stuName) && stuNum.equals(other.stuNum);
	}
	
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", stuName=" + stuName + ", math=" + math + ", chinese=" + chinese + "]";
	}
	
	
}
