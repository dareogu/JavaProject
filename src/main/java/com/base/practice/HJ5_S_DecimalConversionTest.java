package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-14 23:51
 * 需求：写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 **/
public class HJ5_S_DecimalConversionTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String str = sc.nextLine();
      System.out.println(decimalConversion(str.substring(2)));
    }
  }

  public static int decimalConversion(String s) {
    /**
     * 例：2AF5换算成10进制:
     * 用竖式计算：
     * 第0位： 5 * 16^0 = 5
     * 第1位： F * 16^1 = 240
     * 第2位： A * 16^2= 2560
     * 第3位： 2 * 16^3 = 8192
     * 直接计算就是：
     * 5 * 16^0 + F * 16^1 + A * 16^2 + 2 * 16^3 = 10997
     *
     */
    int n = 0;
    int digit = 0;
    int temp = 0;
    char ch;

    while (digit < s.length()) {
      ch = s.charAt(s.length() - digit - 1);
      if (ch >= '0' && ch <= '9') {
        temp = ch - '0';
      } else if (ch >= 'A' && ch <= 'F') {
        temp = ch - 'A' + 10;
      } else if (ch >= 'a' && ch <= 'f') {
        temp = ch - 'a' + 10;
      } else {
        break;
      }
      n += temp * Math.pow(16, digit);
      digit++;
    }
    return n;
    // 可以使用如下如下方法直接把16进制数转为10进制数
    // return Integer.parseInt(s, 16);
  }
}
