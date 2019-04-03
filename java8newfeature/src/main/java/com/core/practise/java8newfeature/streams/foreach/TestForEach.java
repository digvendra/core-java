package com.core.practise.java8newfeature.streams.foreach;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {

  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    l.add("rvk");
    l.add("rk");
    l.add("rkv");
    l.add("rvki");
    l.add("rvkir");

    l.forEach(System.out::println);
  }

}
