package com.ss.mar;

public class Producer implements Runnable {

	@Override
	public void run() {
		System.out.println("Producer is running");
		while(true) {
			
			try {
				if(Buffer.isFull()) {
					Thread.sleep(750);
				}else {
					produce();
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void produce() {
		System.out.println("Producer added to the buffer");
		Buffer.addToBuffer();
	}
}
