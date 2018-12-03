package comsynway.thread;

import comsynway.thread.method.Producer;

public class ThreadA extends Thread {

	private Producer producer;

	public ThreadA(Producer producer) {
		super();
		this.producer = producer;
	}
	@Override
	public void run() {
		while(true){
			producer.setValue();
		}
	}
}
