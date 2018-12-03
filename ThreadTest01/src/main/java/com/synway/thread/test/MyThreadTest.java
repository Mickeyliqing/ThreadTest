package com.synway.thread.test;

import com.synway.thread.THreadA;
import com.synway.thread.Thread01;
import com.synway.thread.ThreadB;

public class MyThreadTest {

	public static void main(String[] args) {
		Thread01 thread01 = new Thread01();
		Thread01 thread02 = new Thread01();
		
		THreadA a = new THreadA(thread01);
		a.start();
		ThreadB b = new ThreadB(thread02);
		b.start();
	}
}
