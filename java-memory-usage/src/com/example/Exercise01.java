package com.example;

@SuppressWarnings("unused")
public class Exercise01 {

	public static void main(String[] args) {
		int x = 42; // 4B (S)
		// -XX:+UseCompressedOops
		// OOP (Ordinary Object Pointer) CompressedOOPs
		Integer y = Integer.valueOf(42); // 4B(S) + 12B (Object Header) + 4B = 20B
		// -XX:-UseCompressedOops
		Integer z = Integer.valueOf(42); // 8B(S) + 16B + 4B (to hold 42) + 4B (padding)
		x++;
		y++;

	}

}
