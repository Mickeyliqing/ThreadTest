package com.synway.thread.test;

import com.synway.thread.ThreadA;
import com.synway.thread.ThreadB;
import com.synway.thread.method.MethodA;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		MethodA a = new MethodA();
		ThreadA threadA = new ThreadA(a);
		threadA.setName("A");
		ThreadB threadB = new ThreadB(a);
		threadB.setName("B");
		threadA.start();
		//Thread.sleep(50);
		threadB.start();
	}
}
