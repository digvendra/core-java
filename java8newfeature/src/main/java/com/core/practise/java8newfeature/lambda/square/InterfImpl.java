package com.core.practise.java8newfeature.lambda.square;

public class InterfImpl implements Interf {

	@Override
	public void square(int a) {
		System.out.println("Without Lambda Square : " + a*a);
	}

}
