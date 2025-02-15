package com.variables;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		Set<Integer> sn = new HashSet<Integer>();
		sn.add(10);
		sn.add(25);
		sn.add(12);
		sn.add(15);
		System.out.println(sn);
		sn.remove(25);
		System.out.println(sn);
	}

}
