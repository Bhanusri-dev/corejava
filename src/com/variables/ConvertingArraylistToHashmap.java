package com.variables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertingArraylistToHashmap {
	public static void main(String[] args) {
		List<ListIteams> list = new ArrayList<ListIteams>();
		list.add(new ListIteams(1,"sai"));
		list.add(new ListIteams(2,"bhanu"));
		list.add(new ListIteams(3,"chinni"));
		Map<Integer,String> map = new HashMap<Integer, String>();
		list.forEach((n) -> { map.put(n.getKey(), n.getValue()); });
		System.out.println("Map :" +map);
	}

}
