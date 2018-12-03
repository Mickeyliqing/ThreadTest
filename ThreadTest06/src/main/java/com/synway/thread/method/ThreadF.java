package com.synway.thread.method;

public class ThreadF extends Thread {

	private Object lock;

	public ThreadF(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		MethodB b = new MethodB();
		b.notifyTest(lock);
	}
	
	/*@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
		}
	}*/
}
