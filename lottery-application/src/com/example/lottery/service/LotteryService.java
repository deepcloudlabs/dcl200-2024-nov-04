package com.example.lottery.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class LotteryService {
	public List<Integer> getNumbers(int max,int size){
		return ThreadLocalRandom.current()
				                .ints(1, max)
				                .distinct()
				                .limit(size)
				                .sorted()
				                .boxed()
				                .toList();
	}
	
	public List<List<Integer>> getNumbers(int max,int size,int column){
		return IntStream.range(0, column)
				.mapToObj( i -> getNumbers(max,size))
				.toList();
	}
}	
