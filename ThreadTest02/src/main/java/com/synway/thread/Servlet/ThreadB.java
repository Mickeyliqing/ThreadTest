package com.synway.thread.Servlet;

public class ThreadB extends Thread {

	@Override
	public void run() {
		ThreadServlet.doPost("b", "BB");
	}
}
