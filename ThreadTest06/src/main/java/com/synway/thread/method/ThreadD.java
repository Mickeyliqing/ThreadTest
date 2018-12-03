package com.synway.thread.method;

public class ThreadD extends Thread {

	private Object lock;

	public ThreadD(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		MethodB b = new MethodB();
		b.waitTest(lock);
	}
}
