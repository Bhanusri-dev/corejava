package com.variables;

public class Constructor {
	int num1;
	int num2;
	public Constructor(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public Constructor() {
		super();
		int n1=100;
		int n2 = 50;
		int n3 = n1 -n2;
		System.out.println(n3);
		
	}
	public static void main(String[] args) {
		Constructor cn = new Constructor(100,30);
	    Constructor cn1 = new Constructor();
	    
		
	}
	
	

}
