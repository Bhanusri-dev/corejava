package com.variables;

abstract class Abstraction {
	abstract void add();
	public Abstraction(int a ,String name) {
		System.out.println(a+" "+name);
		
	}
	public void add1() {
		int a= 200;
		int b = 300;
		int c= a+b;
		System.out.println(c);
	}
	

}
