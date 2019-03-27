package com.core.practise.java8newfeature.lambda.localvariable;


/**
 * 1. From lambda expression we can access enclosing class variables and enclosing method variables directly.<br>
 * 2. The local variables referenced from lambda expression are implicitly final and 
 * hence we can’t perform re-assignment for those local variables otherwise we get compile time error
 *
 */
public class LambdaLocalVariableDemo {
	
	int x = 22;
	
	public void methodTwo() {
		int y = 20;
		Interf lInterf = () -> {
			System.out.println(x);
			System.out.println(y);
			x=99;
			//y=10; //CE : "Local variable y defined in an enclosing scope must be final or effectively final"
		};
		lInterf.methodOne();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
