package com.core.practise.java8newfeature.predicate.predicateintofunction;

import java.util.function.Predicate;

public class PredicateIntoFunctionMain {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 5;
		functionDemo(1, p);
	}
	
	static void functionDemo(int i, Predicate<Integer> p) {
		if(p.test(i)) {
			System.out.println(i);
		}
	}

}
