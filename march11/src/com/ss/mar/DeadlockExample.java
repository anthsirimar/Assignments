package com.ss.mar;

public class DeadlockExample {

	public static void main(String[] args) {
		String line1 = "one";
		String line2 = "two";

		Runnable thread1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (line2) {
						Thread.sleep(100);
						synchronized (line1) {
							System.out.println("Thread 1 got both locks.");
						}
					}
				} catch (Exception e) {
					
				}

			}
		};
		
		Runnable thread2 = new Runnable() {
			
			@Override
			public void run() {
				try {
					synchronized(line1) {
						Thread.sleep(100);
						synchronized(line2) {
							System.out.println("Thread 2 got both locks.");
						}
					}
				}catch (Exception e) {
						
				}
			}
		};
		
		new Thread(thread1).start();
		new Thread(thread2).start();
		System.out.println("End");
	}

}
