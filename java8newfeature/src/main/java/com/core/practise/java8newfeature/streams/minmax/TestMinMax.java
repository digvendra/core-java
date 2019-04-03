package com.core.practise.java8newfeature.streams.minmax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMinMax {

  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    l.add("rvk");
    l.add("rk");
    l.add("rkv");
    l.add("rvki");
    l.add("rvkir");

    String min = l.stream().min((s1, s2) -> s1.compareTo(s2)).get();
    System.out.println("Min : " + min);

    String max = l.stream().max((s1, s2) -> s1.compareTo(s2)).get();
    System.out.println("Max : " + max);

    List<Integer> lInt = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      lInt.add(i);
    }

    Comparator<Integer> IntComp = (i1, i2) -> {
      if (i1 < i2) {
        return -1;
      }
      if (i1 > i2) {
        return 1;
      }
      return 0;
    };
    System.out.println("Integer min : " + lInt.stream().min(IntComp).get());
    System.out.println("Integer max : " + lInt.stream().max(IntComp).get());

  }

}
