package com.synawy.thread;

import com.synawy.thread.method.Method;

public class ThreadB extends Thread {

	private Method method = new Method();

	public ThreadB(Method method) {
		super();
		this.method = method;
	}
	@Override
	public void run() {
		super.run();
		method.add("b");
	}
}
