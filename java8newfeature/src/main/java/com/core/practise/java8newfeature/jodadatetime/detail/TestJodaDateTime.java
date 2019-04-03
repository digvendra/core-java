package com.core.practise.java8newfeature.jodadatetime.detail;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;

public class TestJodaDateTime {

  public static void main(String[] args) {
    LocalDate ldate = LocalDate.now();
    System.out.printf("\n%d-%d-%d", ldate.getDayOfMonth(), ldate.getMonthValue(), ldate.getYear());

    LocalTime ltime = LocalTime.now();
    System.out.printf("\n%d:%d:%d:%d", ltime.getHour(), ltime.getMinute(), ltime.getSecond(),
        ltime.getNano());

    LocalDateTime lCustomDateTime = LocalDateTime.of(2019, Month.JANUARY, 04, 07, 00);
    System.out.println("\nCustom date : " + lCustomDateTime);
    System.out.println("After 6 Month : " + lCustomDateTime.plusMonths(6));
    System.out.println("Before 6 Month : " + lCustomDateTime.minusMonths(6));

    ZoneId zone = ZoneId.systemDefault();
    System.out.println("ZoneId : " + zone);

    LocalDate before6month = ldate.minusMonths(6);
    Period lperiod = Period.between(before6month, ldate);
    System.out.printf("period difference is %d year %d months %d days", lperiod.getYears(),
        lperiod.getMonths(), lperiod.getDays());
  }

}
