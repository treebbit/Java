package com.github.treebbit.ch03;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		System.out.println(++x + " " + y++);
		System.out.println(x + " " + y);
		
		System.out.println(--x + " " + y--);
		System.out.println(x + " " + y);
	}
}
