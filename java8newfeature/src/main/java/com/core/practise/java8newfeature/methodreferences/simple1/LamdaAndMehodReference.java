package com.core.practise.java8newfeature.methodreferences.simple1;

public class LamdaAndMehodReference {

  public void m2(int i) {
    System.out.println("Method Reference : " + i);
  }

  public static void main(String[] args) {
    Interf i = l -> System.out.println("From Lamda expression : " + l);
    i.m1(10);

    LamdaAndMehodReference mref = new LamdaAndMehodReference();
    Interf i1 = mref::m2;
    i1.m1(10);
  }

}
