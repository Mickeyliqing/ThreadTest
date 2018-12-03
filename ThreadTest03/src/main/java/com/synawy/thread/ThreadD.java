package com.synawy.thread;

import com.synawy.thread.method.MethodTask;

public class ThreadD extends Thread{

	private MethodTask task = new MethodTask();

	public ThreadD(MethodTask task) {
		super();
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		task.doTask();
	}
}
