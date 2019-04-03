package com.core.practise.java8newfeature.streams.processingbycollect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollect {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      l.add(i);
    }
    System.out.println("Before processing : " + l);
    List<Integer> filteredList = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println("After processing : " + filteredList);
  }

}
