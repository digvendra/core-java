package com.core.practise.java8newfeature.streams.sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {

  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    l.add("rvk");
    l.add("rk");
    l.add("rkv");
    l.add("rvki");
    l.add("rvkir");


    List<String> l1 = l.stream().sorted().collect(Collectors.toList());
    System.out.println("Natural sorting : " + l1);

    List<String> l2 = l.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
    System.out.println("Reverse sorting : " + l2);

  }

}
