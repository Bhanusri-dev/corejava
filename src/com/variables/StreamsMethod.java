package com.variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethod {
	public static void main(String[] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println("print the list" +al);
		List<Integer> ls= al.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("print the list after sorting" +ls);
	}

}
