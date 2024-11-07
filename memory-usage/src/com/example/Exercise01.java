package com.example;

public class Exercise01 {

	public static void main(String[] args) {
		String fullname1 = "jack bauer"; // constant pool -> object pooling -> immutable
		String fullname2 = "jack bauer"; // constant pool
		String fullname3 = new String("jack bauer"); // heap
		fullname3 = fullname3.intern();
		System.out.println("fullname1 == fullname2: "+(fullname1 == fullname2));
		System.out.println("fullname1 == fullname3: "+(fullname1 == fullname3));
        // Default GC -> G1GC since Java SE 9
		// -XX:+UseG1GC
		// String De-duplication: -XX:+UseStringDeduplication
		// -XX:G1HeapRegionSize=8m
		// -XX:InitiatingHeapOccupancyPercent=60
		// -XX:MaxGCPauseMillis=200 // SLA
		// XX:G1PeriodicGCInterval=1m
		// For more than one CPU, consider the following option:
		// -XX:+UseNUMA
		// Since Java SE 17
		// -XX:AsyncLogBufferSize=
	}

}
