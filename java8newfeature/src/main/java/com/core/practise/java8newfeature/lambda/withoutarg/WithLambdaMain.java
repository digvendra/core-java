package com.core.practise.java8newfeature.lambda.withoutarg;

public class WithLambdaMain {

	public static void main(String[] args) {
		Interf lInterf = () -> System.out.println("method one with lambda");
		lInterf.methodOne();
	}

}
