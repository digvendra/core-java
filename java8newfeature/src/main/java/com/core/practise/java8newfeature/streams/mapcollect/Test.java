package com.core.practise.java8newfeature.streams.mapcollect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    l.add("rvk");
    l.add("rk");
    l.add("rkv");
    l.add("rvki");
    l.add("rvkir");

    System.out.println("Before processing : " + l);

    List<String> l1 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    System.out.println("After processing : " + l1);
  }

}
