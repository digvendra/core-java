package com.core.practise.java8newfeature.lambda.square;

public class WithLambaSquare {

	public static void main(String[] args) {
		Interf lInterf = a -> System.out.println("With Lambda Square : " + a*a);
		lInterf.square(10);
	}

}
