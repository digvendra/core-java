package com.core.practise.java8newfeature.lambda.runnable;

public class RunnableWithLambdaThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "...Running");
		RunnableWithLambdaThreadMain lMain = new RunnableWithLambdaThreadMain();
		lMain.runnableWithLambdaThreadDemo();
		System.out.println(Thread.currentThread().getName() + "...Stopping");
	}
	
	public void runnableWithLambdaThreadDemo() {
		System.out.println("Creating lambda runnable...");
		Thread lChildThread = new Thread(() -> {
			Thread.currentThread().setName(getClass().getSimpleName()+"Thread");
			System.out.println(Thread.currentThread().getName() + "...Started");
			for(int i = 0; i<10 ; i++)
			{
				System.out.println(Thread.currentThread().getName() + " Loop...." + i);
			}
			System.out.println(Thread.currentThread().getName() + "...Stopping");
		});
		lChildThread.start();
	}

}
