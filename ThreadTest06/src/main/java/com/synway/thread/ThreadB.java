package com.synway.thread;

import com.synway.thread.method.MethodA;

public class ThreadB extends Thread{

	private MethodA methodA;

	public ThreadB(MethodA methodA) {
		super();
		this.methodA = methodA;
	}
	@Override
	public void run() {
		try {
			synchronized (methodA) {
				for (int i = 0; i < 10; i++) {
					methodA.add();
					if(methodA.size() == 5){
						methodA.notify();
						System.out.println(Thread.currentThread().getName() + " 已经发出通知");
					}
					System.out.println(Thread.currentThread().getName() + " 添加了" + (i+1) + "个元素");
					Thread.sleep(2000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
