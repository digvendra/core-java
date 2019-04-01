package com.core.practise.java8newfeature.function.simple;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		Function<String,Integer> f = s -> s.length();
		System.out.println(f.apply("String"));
	}

}
