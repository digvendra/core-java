package com.core.practise.java8newfeature.methodreferences.simple;

public class WithMethodReference {

  public static void m1() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Childthread : " + i);
    }
  }

  public static void main(String[] args) {
    Runnable r = WithMethodReference::m1;
    Thread t = new Thread(r);
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }

  }

}
