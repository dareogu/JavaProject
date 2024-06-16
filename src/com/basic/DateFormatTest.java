package com.basic;

import java.util.Date;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:28
 **/
public class DateFormatTest {

  public static void main(String[] args) {
    Date date = new Date();

    // 显示格式化时间  Due date: 六月 16, 2024
    System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
  }
}
