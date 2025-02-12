package com.variables;

public class Variables {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 100; // 8-bit signed integer
        short s = 20000; // 16-bit signed integer
        int i = 100000; // 32-bit signed integer
        long l = 100000L; // 64-bit signed integer
        float f = 10.5f; // 32-bit floating point
        double d = 20.99; // 64-bit floating point
        char c = 'A'; // Single 16-bit Unicode character
        boolean isJavaFun = true; // Boolean value (true/false)

        // Reference Data Types
        String str = "Hello, Java!"; // Reference to a string object
        Integer integerObj = 200; // Integer object (Wrapper class for int)
        
        // Printing all the variable values
        System.out.println("byte b: " + b);
        System.out.println("short s: " + s);
        System.out.println("int i: " + i);
        System.out.println("long l: " + l);
        System.out.println("float f: " + f);
        System.out.println("double d: " + d);
        System.out.println("char c: " + c);
        System.out.println("boolean isJavaFun: " + isJavaFun);
        System.out.println("String str: " + str);
        System.out.println("Integer integerObj: " + integerObj);
    }
}
