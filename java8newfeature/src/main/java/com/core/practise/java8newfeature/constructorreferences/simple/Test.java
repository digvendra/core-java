package com.core.practise.java8newfeature.constructorreferences.simple;

public class Test {

  public static void main(String[] args) {
    Interf i = s -> new Sample(s);
    i.get("From Lambda Expression");

    Interf i1 = Sample::new;
    i1.get("From Method Reference");

  }

}
