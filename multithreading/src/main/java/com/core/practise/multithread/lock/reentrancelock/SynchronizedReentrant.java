package com.core.practise.multithread.lock.reentrancelock;

public class SynchronizedReentrant {
	
	public synchronized void  outer() {
		inner();
	}
	
	public synchronized void  inner() {
		
	}

}
