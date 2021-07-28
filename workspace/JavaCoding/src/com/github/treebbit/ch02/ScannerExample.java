package com.github.treebbit.ch02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("i: " + i);
		
		double d = scan.nextDouble();
		System.out.println("d: " + d);
		
		String s1 = scan.next();
		System.out.println("s1: " + s1);
		
		String s2 = scan.nextLine();
		System.out.println("s2: " + s2);
	}
}
