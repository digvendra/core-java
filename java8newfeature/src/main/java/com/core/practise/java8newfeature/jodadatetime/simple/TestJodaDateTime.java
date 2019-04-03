package com.core.practise.java8newfeature.jodadatetime.simple;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestJodaDateTime {

  public static void main(String[] args) {
    LocalDate ldate = LocalDate.now();
    LocalTime ltime = LocalTime.now();
    System.out.println("Local Date : " + ldate);
    System.out.println("Local Time : " + ltime);
  }

}
