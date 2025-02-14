package com.variables;

public class Exception_Handling {
	public static void main(String[] args) {
		
	
	int amount = 200;
	
	try {
		int a=100/0;
		System.out.println(a);
		
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	   }
	  try {  
          String str = "sai";
		int num = Integer.parseInt(str );   
          System.out.println("Parsed number: " + num);  
      } catch (NumberFormatException e) {  
          System.out.println("Error: Unable to parse the string as an integer.");  
      } 

}
}
