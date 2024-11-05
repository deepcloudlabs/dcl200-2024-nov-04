package com.example;

/*
  For windows:
  Millis elapsed: 5359
  Millis elapsed: 1.33975
  For Ubuntu/Linux
  Millis elapsed: 4303
  Millis elapsed: 1.07575
 */
public class SchedulerOverhead {
	public static void main(String[] args) throws InterruptedException {
		var begin = System.currentTimeMillis();
		for (int i=0;i<2_000;++i) {
			Thread.sleep(2);
		}
		var end = System.currentTimeMillis();
		System.out.println("Millis elapsed: "+(end-begin));
		System.out.println("Millis elapsed: "+(end-begin)/4_000.0);
	}

}
