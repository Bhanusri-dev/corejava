package com.variables;

public class DefaultMethod implements DefaultStatic{

	@Override
	public void car(int id, String name) {
		
		System.out.println(id+" "+name);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		DefaultMethod dm= new DefaultMethod();
		dm.bike("suzik", "black");
		DefaultStatic.add(20,30);
		dm.car(2009	, "honda");;
	}

}
