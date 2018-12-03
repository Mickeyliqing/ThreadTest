package com.synawy.thread;

import com.synawy.thread.method.MethodBegin;

public class ThreadH extends Thread {

	private MethodBegin begin = new MethodBegin();

	public ThreadH(MethodBegin begin) {
		super();
		this.begin = begin;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		begin.getString();
	}
}
