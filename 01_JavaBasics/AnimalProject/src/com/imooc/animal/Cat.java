package com.imooc.animal;

public class Cat extends Animal{
	private double weight;
	public int temp=300;
	public static int st3 = 44;
	
	static {
		System.out.println("子类静态代码块");
	}
	
	{
		System.out.println("子类代码块");
	}
	
	public Cat() {
		System.out.println("子类无参构造");
	}
	
	public Cat(String name, int month) {
		super(name, month);
		System.out.println("子类带参构造");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Run
	public void run() {
		eat();
		System.out.println(this.getName() + "是一只" + this.getSpecies() + "，快乐的奔跑。 ");
	}

	public void play() {
		System.out.println("cat plays");
		
	}
	
	
}
