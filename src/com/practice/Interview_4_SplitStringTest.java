package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-14 17:51
 * 需求：连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；长度不是8整数倍的字符串请在后面补数字0，空字符串不处理
 **/
public class Interview_4_SplitStringTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String s = scanner.nextLine();
      split(s);
    }
  }

  public static void split(String s) {
    while (s.length() >= 8) {
      System.out.println(s.substring(0, 8));
      s = s.substring(8);
    }
    if (s.length() < 8 && s.length() > 0) {
      s = s + "00000000";
      System.out.println(s.substring(0, 8));
    }
    //第二种简单方法，反向思维，首先判断是否需要补0，然后直接一个方法搞定
//    if (s.length() % 8 != 0) {
//      s = s + "00000000";
//    }
//    for (int i = 0, j = 0; i < s.length() / 8; i++, j += 8) {
//      System.out.println(s.substring(j, j + 8));
//    }
  }
}
