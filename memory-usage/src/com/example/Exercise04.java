package com.example;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class Exercise04 {
    private static List<String> list = new ArrayList<>();
	private static WeakHashMap<String , Integer> cache= new WeakHashMap<>();
    
	public static void main(String[] args) throws InterruptedException {
		fun();
		var strongRef = new Circle(1,2,3);
		WeakReference<Circle> weakRef = new WeakReference<>(strongRef);
		strongRef = null;
		System.gc(); // unless -XX:+DisableExplicitGC
		var circle = weakRef.get();
		if (Objects.nonNull(circle)) {
			circle.area();
		}
		TimeUnit.SECONDS.sleep(60);
	}
	
	public static void fun() {
		for (int i = 0; i < 1_000_000; i++) {
			list.add("Leaking Memory " + i);
		}		
	}

}

record Circle(int x,int y,int radius) {
	public double area() {return Math.PI * this.radius * this.radius; }
}