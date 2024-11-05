package com.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;
// 64B -> 300M ->    19200MB -> 20GB x2  -> 40GB
// 8GB Memory VM -> Cluster -> 40/6 ~ 7 Nodes
// Java Process -> JVM -> Heap: Eden (256M) + Survivor (256MB) (s0 + s1) + Tenure (3GB)                 
public class StudyObjectLayoutExercise02 {
    // -XX:-UseCompressedOops
	public static void main(String[] args) {
		System.out.println(VM.current().details());	
		System.out.println(ClassLayout.parseClass(BBB.class).toPrintable());	
	}

}

class AAA { 
	byte x;
}

class BBB extends AAA {
	byte y;
}

