package com.synway.thread;

import com.synway.thread.method.MethodA;

public class ThreadB extends Thread {

	private MethodA a = new MethodA();

	public ThreadB(MethodA a) {
		super();
		this.a = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		a.methodtest();
	}
}
