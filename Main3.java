package com.day7assignment;

public class Main3 {

	public static void main(String[] args) {
		new ThisParent().sum();
		new Child().sum();

	}

}
class ThisParent{
	int a = 20;
	static int b = 30;
	void sum() {
		this.a = 300; // refer to the parent class instance variable
		this.b = 200; // refer to the parent class static variable
		System.out.println(a+b);
	}
}

class SuperParent{
	int a = 20;
	static int b = 30;
}

class Child extends SuperParent{
	void sum() {
		System.out.println(super.a + super.b);
	}
}
