package com.example.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.example.jfr.events.LotteryEvent;

public class LotteryService {
	public List<Integer> draw(int max, int size, boolean sorted, boolean unique) {
		var event = new LotteryEvent();
		event.setMax(max);
		event.setSize(size);
		event.begin();
		var stream = ThreadLocalRandom.current().ints(1, max);
		if (unique)
			stream = stream.distinct();
		stream = stream.limit(size);
		if (sorted)
			stream = stream.sorted();
		event.end();
		event.commit();		
		return stream.boxed().toList();
	}
}
