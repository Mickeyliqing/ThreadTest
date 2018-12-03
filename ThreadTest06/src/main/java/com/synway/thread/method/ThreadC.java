package com.synway.thread.method;

public class ThreadC extends Thread {

	private Object lock;

	public ThreadC(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		MethodB b = new MethodB();
		b.waitTest(lock);
	}
}
