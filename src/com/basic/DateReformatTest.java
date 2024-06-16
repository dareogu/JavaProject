package com.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:31
 **/
public class DateReformatTest {
  public static void main(String[] args) throws ParseException {
    String strDate = "01/01/2011";
    Date sdf = new SimpleDateFormat("MM/dd/yyyy").parse(strDate);
    String strDate1 = new SimpleDateFormat("yyyy-MM-dd").format(sdf.getTime()).toString();
    System.out.println(strDate1); //2011-01-01
  }
}
