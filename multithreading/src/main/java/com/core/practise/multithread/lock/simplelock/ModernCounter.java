package com.core.practise.multithread.lock.simplelock;

public class ModernCounter {
	
	private Lock lock = new Lock();
	private int counter;
	
	public int inc() throws InterruptedException {
			lock.lock();
			int result = counter;
			try {
				result = ++counter;
			} finally {
				lock.unLock();
			}
			return result;
	}

}
