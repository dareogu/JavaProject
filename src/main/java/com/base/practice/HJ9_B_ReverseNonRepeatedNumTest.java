package com.base.practice;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 17:44
 * 需求：输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 **/
public class HJ9_B_ReverseNonRepeatedNumTest {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
//    while (scanner.hasNext()) {
//      String s = scanner.nextLine();
//      int len = s.length();
//      int[] arr1 = new int[10];
//      for (int i = len - 1; i >= 0; i--) {
//        if (arr1[s.charAt(i) - 48] == 0) {
//          System.out.print(s.charAt(i) - 48);
//          arr1[s.charAt(i) - 48]++;
//        }
//      }
//    }

    //# Solution 2
    while (scanner.hasNext()) {
      String s = new StringBuilder(scanner.nextLine()).reverse().toString();
      Set<Character> sets = new LinkedHashSet<>();
      for (char c : s.toCharArray()) {
        sets.add(c);
      }
      sets.forEach(character -> System.out.print(character));
    }
  }
}
