package com.core.practise.java8newfeature.defaultmethod.multipleinheritance;

public interface Right {
	
	public default void commonMethod() {
		System.out.println(getClass().getSimpleName() + " Common method");
	}

}
