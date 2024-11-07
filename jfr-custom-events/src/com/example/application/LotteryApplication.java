package com.example.application;

import java.util.concurrent.TimeUnit;

import com.example.service.LotteryService;

public class LotteryApplication {
    // -XX:StartFlightRecording=duration=1m,filename=c:/tmp/lottery.jfr
	public static void main(String[] args) throws InterruptedException {
		var service = new LotteryService();
		while (true) {
			service.draw(60, 6, true, true);
			TimeUnit.SECONDS.sleep(1);
		}
	}

}
