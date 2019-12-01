package com.dareo.demo;

/**
 * timestamp 和string的相互转化
 *
 * @author Dareo_Gu
 * 2018-09-27 22:01:36.0
 */

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampTest {
  public static void main(String[] args) {
    Timestamp now = new Timestamp(new Date().getTime());
    System.out.println(now);

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" + ".0");
    String time = df.format(new Date());
    Timestamp ts = Timestamp.valueOf(time);
    System.out.println(ts);
  }
}