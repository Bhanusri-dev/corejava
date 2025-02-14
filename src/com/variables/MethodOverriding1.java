package com.variables;

public class MethodOverriding1 extends MethodOverriding{

	@Override
	public void car(int id, String name) {
		// TODO Auto-generated method stub
		super.car(id, name);
		System.out.println(id+" "+name);
	}
	public void bike(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		MethodOverriding1 mn = new MethodOverriding1();
		mn.bike("bhanu");
		mn.car(100, "sai");
		
	}
	
	

}
