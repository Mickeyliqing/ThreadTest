package com.synway.thread.Servlet;

public class ThreadA extends Thread {

	@Override
	public void run() {
		ThreadServlet.doPost("a", "AA");
	}
}
