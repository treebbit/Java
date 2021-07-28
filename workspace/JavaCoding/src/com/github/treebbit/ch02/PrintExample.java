package com.github.treebbit.ch02;

public class PrintExample {
	public static void main(String[] args) {
		int i = 123;
		System.out.printf("value: %d원%n", i);
		System.out.printf("value: %6d원%n", i);
		System.out.printf("value: %-6d원%n", i);
		System.out.printf("value: %06d원%n", i);
		
		double d = 123.456789;
		System.out.printf("value: %f원%n", d);
		System.out.printf("value: %10.2f원%n", d);
		System.out.printf("value: %-10.2f원%n", d);
		System.out.printf("value: %010.2f원%n", d);
		
		String s = "임채은";
		System.out.printf("%s입니다.%n", s);
		System.out.printf("%4s입니다.%n", s);
		System.out.printf("%-4s입니다.%n", s);
	}
}
