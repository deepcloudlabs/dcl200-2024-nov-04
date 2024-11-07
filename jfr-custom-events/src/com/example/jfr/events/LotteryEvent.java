package com.example.jfr.events;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

import jdk.jfr.*;

@Name("LotteryEvent")
@Label("Simple Lottery Draw Event")
@Category("Lottery")
@Description("Simple Lottery Draw Event")
public class LotteryEvent extends Event {
	@Label("Event ID")
	private String id = UUID.randomUUID().toString();
	@Label("Event TimeStamp")
	@Timestamp
	private long timestamp = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
	@Label("Lottery Max")
	private int max;
	@Label("Lottery Size")
	@DataAmount
	private int size;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
