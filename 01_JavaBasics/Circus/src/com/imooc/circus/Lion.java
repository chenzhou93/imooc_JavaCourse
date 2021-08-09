package com.imooc.circus;

public class Lion extends Animal implements IAct {
	private String color;
	private String sex;

	public Lion(String name, int age, String color, String sex) {
		super(name, age);
		this.color = color;
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("技能：擅长钻火圈");

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName());
		System.out.println("年龄：" + this.getAge() + "岁");
		System.out.println("性别：" + this.getSex());
		System.out.println("毛色：" + this.getColor());
	}

	@Override
	void describeHobby() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢吃各种肉类");

	}

}
