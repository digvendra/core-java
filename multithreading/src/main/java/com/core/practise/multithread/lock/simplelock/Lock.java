package com.core.practise.multithread.lock.simplelock;

public class Lock {
	
	private boolean isLocked = false;
	
	public synchronized void lock() throws InterruptedException {
		while(isLocked) {
			wait();
		}
		isLocked = true;
	}
	
	public synchronized void unLock() {
		isLocked = false;
		notifyAll();
	}

}
