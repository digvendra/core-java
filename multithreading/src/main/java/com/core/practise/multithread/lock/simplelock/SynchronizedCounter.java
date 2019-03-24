package com.core.practise.multithread.lock.simplelock;

public class SynchronizedCounter {
	
	private int counter;
	
	public int inc() {
		synchronized (this) {
			return ++counter;
		}
	}

}
