package com.variables;

import java.util.LinkedHashMap;

public class Linkedmap {
	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<String, String>();
		map.put("sai", "bhanu");
		map.put("kanna", "chinni");
		LinkedHashMap<String,String> map1 = new LinkedHashMap<String, String>();
		map1.put("chodisetti", "jagannadha");
		map1.put("sri", "chintu");
		System.out.println(map);
		System.out.println(map1);
	}

}
