package com.demo;

/**
 * 回文数
 *
 * @author Dareo_Gu
 */
public class PalindromeNumberTest {

  public static void main(String[] args) {
    int i = 1361;
    String s = String.valueOf(i);
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    if (s.contentEquals(sb)) {
      System.out.println(i + "是回文数！");
    } else {
      System.out.println(i + "不是回文数！");
    }
    System.out.println("====================================");

    int count = 0;
    for (int j = 0; j < sb.length(); j++) {
      if (s.charAt(j) != sb.charAt(j)) {
        System.out.println(i + "不是回文数！");
        break;
      }
      count++;
    }

    if (count == sb.length()) {
      System.out.println(i + "是回文数！");
    }
  }

}