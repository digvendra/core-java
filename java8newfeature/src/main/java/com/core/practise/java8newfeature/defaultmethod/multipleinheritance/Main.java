package com.core.practise.java8newfeature.defaultmethod.multipleinheritance;

public class Main implements Left, Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void commonMethod() {
		System.out.println(getClass().getSimpleName() + " Common method");
	}

}
