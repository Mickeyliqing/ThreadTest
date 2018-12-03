package comsynway.thread;

import comsynway.thread.method.Consumer;

public class ThreadB extends Thread {

	private Consumer consumer;

	public ThreadB(Consumer consumer) {
		super();
		this.consumer = consumer;
	}
	@Override
	public void run() {
		while(true){
			consumer.getValue();
		}
	}
}
