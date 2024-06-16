package com.basic;

import java.text.SimpleDateFormat;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:40
 **/
public class LongToDateTimeTest {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf.format(Long.parseLong("-2208988800000")));
  }
}
