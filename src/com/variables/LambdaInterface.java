package com.variables;

public class LambdaInterface {
	public static void main(String[] args) {
		Lambda lm = ()->{
			return "I like BMW car";
		};
		
		System.out.println(lm.car());
	
	}

}
