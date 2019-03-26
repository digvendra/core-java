package com.core.practise.java8newfeature.lambda.twoparam;

public class WithLambdaMain {

	public static void main(String[] args) {
		Interf lInterf = (a,b) -> System.out.println("lambda add : " + (a+b));
		lInterf.sum(10, 15);
	}

}
