package com.synway.thread;

import com.synway.thread.method.MethodA;

public class ThreadA extends Thread{

	private MethodA methodA;

	public ThreadA(MethodA methodA) {
		super();
		this.methodA = methodA;
	}
	@Override
	public void run() {
		synchronized (methodA) {
			try {
				if(methodA.size() != 5){
					System.out.println(Thread.currentThread().getName() + " wait()方法开始！");
					methodA.wait();
					System.out.println(Thread.currentThread().getName() + " wait()方法结束！");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
