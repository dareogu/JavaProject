package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-12 17:48
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数,不区分大小写。
 **/
public class Interview_2_CharCountTest {
  public static void main(String[] args) {
    String inputString = inputString();
    System.out.println("请输入一个字符：");
    Scanner in = new Scanner(System.in);
    char inputChar = in.next().charAt(0);
    System.out.println(getCountIgnoreCase(inputString, inputChar));
  }

  private static String inputString() {
    System.out.println("请正确输入一个由字母和数字组成的字符串：");
    Scanner in = new Scanner(System.in);
    String inputStr = in.next();
    if (inputStr.matches("^[A-Za-z0-9]+$")) {
      return inputStr;
    } else {
      return inputString();
    }
  }

  private static int getCountIgnoreCase(String str, char c) {
    int count = 0;
    if (str != null && str.length() > 0) {
      for (int i = 0; i < str.length(); i++) {
        if (String.valueOf(c).equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
          count++;
        }
      }
    } else {
      count = 0;
    }
    return count;
  }
}
