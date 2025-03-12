package com.variables;

import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> game = new Arraylist();
		game.add("chess");
		game.add("cricket");
		game.add("hockey");
		game.add("carroms");
		game.forEach(list->System.out.println(list));
		
	}
	

}
