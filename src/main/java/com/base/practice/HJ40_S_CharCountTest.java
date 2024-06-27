package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 17:06
 * <p>
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 * 数据范围：输入的字符串长度满足 1≤n≤1000
 **/
public class HJ40_S_CharCountTest {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String str = in.nextLine();
      String s1 = str.replaceAll("[A-Z]+|[a-z]+", "");
      System.out.println("英文字母个数： " + (str.length() - s1.length()));
      String s2 = s1.replaceAll(" ", "");
      System.out.println("空格个数： " + (s1.length() - s2.length()));
      String s3 = s2.replaceAll("[0-9]+", "");
      System.out.println("数字个数： " + (s2.length() - s3.length()) + "\n" + "其他字符个数： " + s3.length());
    }
  }
}
