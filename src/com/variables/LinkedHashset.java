package com.variables;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
	public static void main(String[] args) {
		Set<String> sn = new LinkedHashSet<String>();
		sn.add("sai");
		sn.add("bhanu");
		sn.add("chinni");
		sn.add("sony");
		System.out.println(sn);
		sn.remove("sony");
		System.out.println(sn);
		/*
		 * sn.clear(); System.out.println(sn);
		 */
		Set<String> nm = new LinkedHashSet<String>();
		nm.add("chodisetti");
		nm.add("jagannadha");
		sn.addAll(nm);
		System.out.println(sn);
		
		
		
		
	}

}
