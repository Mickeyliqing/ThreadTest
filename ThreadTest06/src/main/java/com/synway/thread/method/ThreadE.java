package com.synway.thread.method;

public class ThreadE extends Thread {

	private Object lock;

	public ThreadE(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		MethodB b = new MethodB();
		b.notifyTest(lock);
		//b.waitTest(lock);
	}
}
