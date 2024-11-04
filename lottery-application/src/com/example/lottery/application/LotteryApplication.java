package com.example.lottery.application;

import com.example.lottery.service.LotteryService;

public class LotteryApplication {

	public static void main(String[] args) {
		var lotteryService = new LotteryService();
		lotteryService.getNumbers(60, 6, 10)
		              .forEach(System.out::println);
	}

}
