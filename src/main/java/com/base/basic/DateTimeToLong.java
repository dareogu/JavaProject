package com.base.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:36
 **/
public class DateTimeToLong {
  public static void main(String[] args) throws ParseException, InterruptedException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    Date beginTime = sdf.parse("2010-01-01 00:00:00");
    long interval = beginTime.getTime();
    System.out.print(interval);
    Thread.sleep(3000L);
  }
}
