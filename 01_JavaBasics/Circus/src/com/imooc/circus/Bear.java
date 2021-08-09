package com.imooc.circus;

public class Bear extends Animal implements IAct{
	
	
	public Bear(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void describeHobby() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢卖萌");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("技能：挽着花篮，打着雨伞，独立走秀");
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName());
		System.out.println("年龄：" + this.getAge() + "岁");
	}

}
