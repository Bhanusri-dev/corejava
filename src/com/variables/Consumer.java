package com.variables;

public class Consumer1 {
	public static void main(String[] args) {
		Consumer<Integer> display = (a) -> { Sysytem.out.println(a)};
		display.accept(a);
		
	}

}
