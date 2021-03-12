package com.ss.mar;

public class Consumer implements Runnable{

	@Override
	public void run() {
		System.out.println("Consumer is running");
		while(true) {
			try {
				if(Buffer.isEmpty()) {
					Thread.sleep(500);
				}
				else{
					consume();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consume() {
		System.out.println("Consumer removed from the buffer");
		Buffer.removeFromBuffer();
	}
}
