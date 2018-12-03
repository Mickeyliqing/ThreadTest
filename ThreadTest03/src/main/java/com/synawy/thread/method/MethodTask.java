package com.synawy.thread.method;

public class MethodTask {

	public void doTask () {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = i = " + i);
		}
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " = i = " + (i+1));
			}
		}
	}
}
