package com.variables;

public class Methods {
	public void add() {
		int n1 = 100;
		int n2 = 200;
		int n3 = n1 + n2;
		System.out.println(n3);
	}
	public int mul(int n1 , int n2) {
		int n3  = n1* n2;
		return n3;
	}
	public String car() {
		String model = "suziki";
		String color = "pink";
		String name = model + color;
		return name;
	}
	public static void bike() {
		int id = 100;
		String name;
		System.out.println(id);
		
	}
	public static int sub(int n1 , int n2) {
		int res = n1- n2;
		return res;
		
	}
	public static void main(String[] args) {
		Methods mn = new Methods();
		mn.add();
		System.out.println(mn.car());
		int i = mn.mul(10, 100);
		System.out.println(i);
		Methods.bike();
	}

}
