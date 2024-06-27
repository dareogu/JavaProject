package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 15:30
 * <p>
 * 输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出
 **/
public class HJ46_B_SubstringTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      // 输入字符串和 k
      String str = sc.next();
      int k = sc.nextInt();
      // 直接使用String的substring方法输出结果
      System.out.println(str.substring(0, k));
    }
  }
}
