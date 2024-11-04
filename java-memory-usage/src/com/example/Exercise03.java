package com.example;

import java.util.List;

public class Exercise03 {

	public static void main(String[] args) {
		var numbers = List.of(Integer.valueOf(4),8,15,16,23,42);
        var array = new int[] {4,8,15,16,23,42}; // L1
        new Integer(42);
        List<Stock> stocks = List.of(new Stock("msft",100),new Stock("orcl",80)); // L1 
	}

	// escape analysis -> stack
	public static void fun() {
		var array = new int[] {4,8,15,16,23,42}; // stack
		
	} 
}

record Stock(String symbol,double price) {} // ready to be used in object pooling
