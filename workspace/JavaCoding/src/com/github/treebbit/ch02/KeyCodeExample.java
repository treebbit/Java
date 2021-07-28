package com.github.treebbit.ch02;

import java.io.IOException;

public class KeyCodeExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		System.out.print("A를 입력해보세요. ");
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();    // 엔터값을 받음
		System.out.println("keyCode: " + keyCode);
	}
}
