package com.ss.mar;

public class Buffer {

	// a 0 in the buffer indicates that the position is "empty" while a 1 indicates
	// that it is occupied
	private static int[] bufferInstance = { 0, 0, 0 };

	public static boolean isEmpty() {
		synchronized (bufferInstance) {
			for (int i = 0; i < bufferInstance.length; i++) {
				if (bufferInstance[i] != 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static boolean isFull() {
		synchronized (bufferInstance) {
			for (int i = 0; i < bufferInstance.length; i++) {
				if (bufferInstance[i] != 1) {
					return false;
				}
			}
			return true;
		}
	}

	public static void addToBuffer() {
		// go through the array and fill the closest available position
		for (int i = 0; i < bufferInstance.length; i++) {
			if (bufferInstance[i] == 0) {
				bufferInstance[i] = 1;
				return;
			}
		}
	}

	public static void removeFromBuffer() {
		// go through the array and remove from the closest available position
		for (int i = 0; i < bufferInstance.length; i++) {
			if (bufferInstance[i] == 1) {
				bufferInstance[i] = 0;
				return;
			}
		}
	}
}
