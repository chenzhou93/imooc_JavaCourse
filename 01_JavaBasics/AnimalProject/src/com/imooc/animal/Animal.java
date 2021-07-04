package com.imooc.animal;

public class Animal {
	private String name="nini";
	protected int month=2;
	String species="animal";
	public int temp=15;
	
	private static int st1 = 22;
	public static int st2 = 23;
	
	static {
		System.out.println("父类静态代码块");
	}
	
	{
		System.out.println("父类代码块");
	}
	
	//父类构造不允许被继承、重写
	public Animal() {
		System.out.println("父类无参构造");
	}
	
	public Animal(String name, int month) {
		System.out.println("父类带参构造");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void eat() {
		System.out.println(this.getName() + "吃东西");
	}
	
	public void eat(String name) {
		System.out.println(name + "吃东西");
	}
//	
//	public boolean equals(Object obj) {
//			
//	}
	
	public boolean equals(Animal obj) {
		if(obj == null) {
			return false;
		}
		
		Animal temp = (Animal) obj;
		if(this.getName().equals(temp.getName()) && this.getMonth() == temp.getMonth()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
