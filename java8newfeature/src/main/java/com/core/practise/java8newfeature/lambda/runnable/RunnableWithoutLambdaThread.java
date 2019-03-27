package com.core.practise.java8newfeature.lambda.runnable;

public class RunnableWithoutLambdaThread implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName(getClass().getSimpleName());
		System.out.println(Thread.currentThread().getName() + "...Started");
		for(int i = 0; i<10 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " Loop...." + i);
		}
		System.out.println(Thread.currentThread().getName() + "...Stopping");
	}

}
