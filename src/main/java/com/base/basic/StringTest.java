package com.base.basic;

import java.util.Arrays;

public class StringTest {
  public static void main(String[] args) {
    char[] a = {'1', 'a', 'v', '0'};
    String s = String.copyValueOf(a, 0, a.length);
    System.out.println(s);

    String str = "aaa11fdf54fdsa";
    String str2 = "aaa11fdf54fdsa";
    boolean t = str.contentEquals(str2);
    System.out.println(t);

    String str3 = str2.substring(3, 6);
    String str4 = str2.substring(5, str2.length());
    System.out.println(str3 + str4);
    System.out.println(str.toUpperCase());

    char[] w = str.toCharArray();
    System.out.println(Arrays.toString(w));

    String[] ch = str.split("1");
    System.out.println(Arrays.toString(ch));

    String d = "{\\\"id\\\":\\\"cust_autoPLT123461680Def\\\"}";
    String e = d.replace("\\", "");
    System.out.println(e);
  }
}
