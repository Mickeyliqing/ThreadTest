package com.synawy.thread;

import com.synawy.thread.method.MethodUser;

public class ThreadE extends Thread {

	private MethodUser user = new MethodUser();

	public ThreadE(MethodUser user) {
		super();
		this.user = user;
	}
	@Override
	public void run() {
		super.run();
		user.setUser("a", "AA");
	}
}
