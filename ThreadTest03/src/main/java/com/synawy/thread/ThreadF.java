package com.synawy.thread;

import com.synawy.thread.method.MethodUser;

public class ThreadF extends Thread {

	private MethodUser user = new MethodUser();

	public ThreadF(MethodUser user) {
		super();
		this.user = user;
	}
	@Override
	public void run() {
		super.run();
		user.setUser("b", "BB");
	}
}
