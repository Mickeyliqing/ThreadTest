package com.synawy.thread;

import com.synawy.thread.method.MethodTask;

public class ThreadC extends Thread {

	private MethodTask task = new MethodTask();

	public ThreadC(MethodTask task) {
		super();
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		task.doTask();
	}
}
