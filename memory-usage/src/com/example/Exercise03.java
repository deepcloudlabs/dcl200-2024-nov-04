package com.example;

public class Exercise03 {

	public static void main(String[] args) {
		var begin = System.currentTimeMillis();
		var result = new StringBuilder(9888890);
		for (int i = 0; i < 1_000_000; i++) {
			result.append("data").append(i);
		}
		var end = System.currentTimeMillis();
		System.out.println("length: %d, duration: %d".formatted(result.length(),end-begin));
	}

}
