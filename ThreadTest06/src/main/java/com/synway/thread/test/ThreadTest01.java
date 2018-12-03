package com.synway.thread.test;

import com.synway.thread.ThreadA;
import com.synway.thread.ThreadB;
import com.synway.thread.method.MethodA;
import com.synway.thread.method.ThreadC;
import com.synway.thread.method.ThreadD;
import com.synway.thread.method.ThreadE;
import com.synway.thread.method.ThreadF;

public class ThreadTest01 {

	public static void main(String[] args) {
		/*try {
			MethodA methodA = new MethodA();
			ThreadA a = new ThreadA(methodA);
			a.setName("A");
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(methodA);
			b.setName("B");
			b.start();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*Object lock = new Object();
		ThreadC c = new ThreadC(lock);
		c.setName("C");
		c.start();
		
		ThreadD d = new ThreadD(lock);
		d.setName("D");
		d.start();*/
		
		Object lock = new Object();
		ThreadC c = new ThreadC(lock);
		c.setName("C");
		c.start();
		
//		ThreadD d = new ThreadD(lock);
//		d.setName("D");
//		d.start();
		
		ThreadE e = new ThreadE(lock);
		e.setName("E");
		e.start();
		
		ThreadF f = new ThreadF(lock);
		f.setName("F");
		f.start();
	}
}
