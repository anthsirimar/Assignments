package com.ss.mar;

public class ProducerConsumerProblem {

	public static void main(String[] args) {

		Thread producer = new Thread(new Producer());
		Thread consumer = new Thread(new Consumer());

		producer.start();
		consumer.start();
	}

}
