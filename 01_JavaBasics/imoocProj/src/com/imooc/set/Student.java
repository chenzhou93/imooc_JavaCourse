package com.imooc.set;

import java.util.Objects;

public class Student {
	private int number;
	private String name;
	private float grade;
	public Student(int number, String name, float grade) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(grade, name, number);
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
		return Float.floatToIntBits(grade) == Float.floatToIntBits(other.grade) && Objects.equals(name, other.name)
				&& number == other.number;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}
