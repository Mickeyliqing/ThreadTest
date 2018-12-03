package com.synawy.thread.test;

import com.synawy.thread.ThreadA;
import com.synawy.thread.ThreadB;
import com.synawy.thread.ThreadC;
import com.synawy.thread.ThreadD;
import com.synawy.thread.ThreadE;
import com.synawy.thread.ThreadF;
import com.synawy.thread.ThreadG;
import com.synawy.thread.ThreadH;
import com.synawy.thread.method.Method;
import com.synawy.thread.method.MethodBegin;
import com.synawy.thread.method.MethodTask;
import com.synawy.thread.method.MethodUser;

public class ThreadTest {

	public static void main(String[] args) {
		/*Method method = new Method();
		ThreadA a = new ThreadA(method);
		a.start();
		ThreadB b = new ThreadB(method);
		b.start();*/
		
		/*Method methoda = new Method();
		Method methodb = new Method();
		ThreadA a = new ThreadA(methoda);
		a.start();
		
		ThreadB b = new ThreadB(methodb);
		b.start();*/
		
		/*MethodTask task = new MethodTask();
		ThreadC c = new ThreadC(task);
		c.start();
		
		ThreadD d = new ThreadD(task);
		d.start();*/
		
		/*MethodUser user = new MethodUser();
		ThreadE e = new ThreadE(user);
		e.setName("A");
		e.start();
		
		ThreadF f = new ThreadF(user);
		f.setName("B");
		f.start();*/
		
		MethodBegin begin = new MethodBegin();
		ThreadG g = new ThreadG(begin);
		g.setName("A");
		g.start();
		
		ThreadH h = new ThreadH(begin);
		h.setName("B");
		h.start();
		
	}
}
