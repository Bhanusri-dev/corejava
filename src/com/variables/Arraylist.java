package com.variables;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(50);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
	}

}
