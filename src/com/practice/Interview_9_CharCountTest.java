package com.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 22:32
 * 需求：编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，
 * 换行表示结束符，不算在字符里。不在范围内的不作统计。
 **/
public class Interview_9_CharCountTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String s = scanner.nextLine();
      int len = getCounts(s);
      System.out.println(len);
      calcCounts(s);
    }
  }

  public static int getCounts(String s) {
    int[] arr = new int[128];
    for (int i = 0; i < s.length(); i++) {
      arr[s.charAt(i)] = 1;
    }
    int len = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        len++;
      }
    }
    return len;
  }

  //# Solution 2 利用SET去重计算字符个数
  //14fdsjldfddjas
  public static void calcCounts(String s) {
    Set<Character> chars = new HashSet<>();
    for (char c : s.toCharArray()) {
      if (c >= 0 && c <= 127) {
        chars.add(c);
      }
    }
    System.out.println(chars.size());
  }
}
