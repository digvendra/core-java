package com.core.practise.java8newfeature.predicate.chaining;

import java.util.function.Predicate;

public class ChainingMain{

	public static void main(String[] args) {
		
		Predicate<Integer> greaterThanTen = i -> i>10;
		Predicate<Integer> lessThanTwenty = i -> i<20;
		
		System.out.println(greaterThanTen.and(lessThanTwenty).test(15));
		System.out.println(greaterThanTen.and(lessThanTwenty.negate()).test(100));
		System.out.println(greaterThanTen.negate().and(lessThanTwenty).negate().test(1));
	}

}
