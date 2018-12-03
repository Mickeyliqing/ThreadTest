package com.synawy.thread;

import com.synawy.thread.method.Method;

public class ThreadA extends Thread {

	private Method method = new Method();

	public ThreadA(Method method) {
		super();
		this.method = method;
	}
	@Override
	public void run() {
		super.run();
		method.add("a");
	}
}
