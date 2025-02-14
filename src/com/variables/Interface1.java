package com.variables;

public class Interface1 implements Interface{

	@Override
	public void add() {
		int a = 100; 
		int b = 200;
		int c= a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		int a=100;
		String name = "sai";
		System.out.println(name);
	}

	@Override
	public void mul() {
		int n1= 20;
		int n2 =5;
		int n3 = n1*n2;
		System.out.println(n3);
		
	}
	public static void main(String[] args) {
		Interface1 nm = new Interface1();
		nm.add();
		nm.mul();
		
	}
	

}
