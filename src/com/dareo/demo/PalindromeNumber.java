package com.dareo.demo;

/**
 * 回文数
 *
 * @author Dareo_Gu
 */
public class PalindromeNumber {

  public static void main(String[] args) {
    int i = 131;
    String s = String.valueOf(i);
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    boolean t = s.contentEquals(sb);
    System.out.println(t);
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

//		String s="123";
//		int i=Integer.parseInt(s);
//		i++;
//		System.out.println(i);
  }

}