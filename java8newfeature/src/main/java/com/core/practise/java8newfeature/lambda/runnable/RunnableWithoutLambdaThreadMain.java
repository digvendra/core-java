package com.core.practise.java8newfeature.lambda.runnable;

public class RunnableWithoutLambdaThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "...Running");
		Thread lChildThread = new Thread(new RunnableWithoutLambdaThread());
		lChildThread.start();
		System.out.println(Thread.currentThread().getName() + "...Stoping");
	}

}
