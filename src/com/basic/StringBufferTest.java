package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBufferTest {
  public static void main(String[] args) {
    String MyStr = new StringBuffer().append("hello").toString();
    MyStr = new StringBuffer().append(MyStr).append(" Guys!").toString();
    System.out.println(MyStr);

    String str = "abcdefg";
    String regex = "cdef";
    Pattern pa = Pattern.compile(regex);
    Matcher ma = pa.matcher(str);
    if (ma.find()) {
      String find = ma.group();
      str = str.replaceAll(regex, new StringBuffer(find).reverse().toString());
      System.out.println(str);
    }
  }
}