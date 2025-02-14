package com.variables;

public class Polymorphism {
	public void add(int a) {
		
		System.out.println(a);
	}
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void add(int b,int a,String name) {
		
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Polymorphism pn = new Polymorphism();
		pn.add(100);
		pn.add(20, 30);
		pn.add(0, 0, "sai");
	}

}
