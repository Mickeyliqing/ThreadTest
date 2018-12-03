package com.synway.thread;

import com.synway.thread.method.MethodA;

public class ThreadA extends Thread {

	private MethodA a = new MethodA();

	public ThreadA(MethodA a) {
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
