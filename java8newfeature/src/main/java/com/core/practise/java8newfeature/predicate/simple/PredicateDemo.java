package com.core.practise.java8newfeature.predicate.simple;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(9));
	}

}
