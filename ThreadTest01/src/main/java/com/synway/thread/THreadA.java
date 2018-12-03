package com.synway.thread;

public class THreadA extends Thread {

	private Thread01 thread01;

	public THreadA(Thread01 thread01) {
		super();
		this.thread01 = thread01;
	}
	
	@Override
	public void run() {
		super.run();
		thread01.addI("a");
	}
}
