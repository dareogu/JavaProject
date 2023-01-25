package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 22:44
 * <p>
 * 输入一个整数，将这个整数以字符串的形式逆序输出程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 **/
public class Interview_10_ReverseTest {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    System.out.println(reverse(n));
  }

  private static String reverse(int n) {
    String str = String.valueOf(n);

    StringBuffer sb = new StringBuffer();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }
}
