package com.variables;

public class Abstraction1 extends Abstraction {

	public Abstraction1(int a, String name) {
		super(a, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void add() {
		int a= 100;
		int b = 200;
		int c= a+b;
		System.out.println(c);
		
		}
	public static void main(String[] args) {
		Abstraction1 ab = new Abstraction1(100, "sai");
		ab.add();
		ab.add1();
	}
	

}
