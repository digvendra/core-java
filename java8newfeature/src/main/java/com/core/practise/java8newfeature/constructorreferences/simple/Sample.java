package com.core.practise.java8newfeature.constructorreferences.simple;

public class Sample {

  private String s;

  Sample() {

  }

  Sample(String s) {
    this.s = s;
    System.out.println("Constructor executed : " + this.s);
  }

}
