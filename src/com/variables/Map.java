package com.variables;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<String, Integer> mn = new HashMap<String, Integer>();
		mn.put("sai",10);
		mn.put("bhanu",10);
		mn.put("sri",10);
		mn.put("chinni",10);
		System.out.println(mn);
		mn.remove("sri" ,10);
		System.out.println(mn);
		
		
	}

}
