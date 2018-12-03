package com.synawy.thread;

import com.synawy.thread.method.MethodBegin;

public class ThreadG extends Thread{

	private MethodBegin begin = new MethodBegin();

	public ThreadG(MethodBegin begin) {
		super();
		this.begin = begin;
	};
	@Override
	public void run() {
		super.run();
		begin.SetString();
	}
}
