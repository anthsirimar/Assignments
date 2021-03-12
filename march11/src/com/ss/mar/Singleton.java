package com.ss.mar;

public class Singleton {

	private static volatile Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
