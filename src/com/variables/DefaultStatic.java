package com.variables;

public interface DefaultStatic {
	
	default String bike(String name, String color) {
		String res= name+color;
		return res;
		
	}
	static void add(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	public void car(int id, String name);

}
