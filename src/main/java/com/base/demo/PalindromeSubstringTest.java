package com.base.demo;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-02-19 23:46
 *
 * 最长回文串
 **/
public class PalindromeSubstringTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String str = sc.next();
      String str1 = longestPalindrome(str);
      System.out.print(str1.length());
    }

  }

  public static String longestPalindrome(String s) {
    int length = s.length();
    int start = 0;
    int end = 0;
    for (int i = 0; i < length; i++) {
      int odd = getLength(s, i, i);
      int even = getLength(s, i, i + 1);
      int temp = odd > even ? odd : even;
      //求出最长回文串的起始和终止位置，注意start与end的计算方法
      if (temp > end - start) {
        start = i - (temp - 1) / 2;
        end = i + temp / 2;
      }
    }
    return s.substring(start, end + 1);
  }

  public static int getLength(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }
}
