package com.variables;

public class Inheritance1 extends Inheritance{
	public void mul() {
		int num1 = 50;
		int num2 = 15;
		int res = num1*num2;
		System.out.println(res);
		}
	public static void main(String[] args) {
		Inheritance1 nm = new Inheritance1();
		nm.mul();
		System.out.println(nm.num);
		System.out.println(nm.add(100,200));
		
	
	}

}
