package com.variables;

public class LambdaInterface {
	public static void main(String[] args) {
//		Lambda lm = ()->{
//			return "I like BMW car";
//		};
//		
//		System.out.println(lm.car());
	Lambda add = (int a, int b) -> a+b;
	Lambda sub = (a,b)-> a-b;
	add.operation(3, 6);
	sub.operation(8, 2);
	System.out.println(add);
	System.out.println(sub);
	}

}
