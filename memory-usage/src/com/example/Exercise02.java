package com.example;

public class Exercise02 {

	public static void main(String[] args) {
		String result = "";
		for (int i = 0; i < 1_000_000; i++) {
			result += "data" + i;
		}
		System.out.println(result.length());
	}

}
