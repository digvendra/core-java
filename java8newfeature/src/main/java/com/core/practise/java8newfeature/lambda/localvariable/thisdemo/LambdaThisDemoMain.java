package com.core.practise.java8newfeature.lambda.localvariable.thisdemo;

/** 
 * 1. Inside lambda expression we can’t declare instance variables.<br>
 * 2. Whatever the variables declare inside lambda expression are simply acts as local variables.<br>
 * 3. Within lambda expression 'this' keyword represents current outer class object reference 
 * (that is current enclosing class reference in which we declare lambda expression)
 *
 */
public class LambdaThisDemoMain {
	
	int x = 777;
	
	public void m2()
	{
		Interf lInter = () -> {
			int x = 999;
			System.out.println("Lambda x = " + x);
			System.out.println("Lambda this.x = " + this.x);
		};
		lInter.methodOne();
	}

	public static void main(String[] args) {
		LambdaThisDemoMain main = new LambdaThisDemoMain();
		main.m2();
	}

}
