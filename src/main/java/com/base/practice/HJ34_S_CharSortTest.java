package com.base.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 16:02
 * <p>
 * Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过代码解决。
 * Lily使用的图片使用字符"A"到"Z"、"a"到"z"、"0"到"9"表示。
 * <p>
 * 输入描述：
 * 一行，一个字符串，字符串中的每个字符表示一张Lily使用的图片。
 * <p>
 * 输出描述：
 * Lily的所有图片按照从小到大的顺序输出
 * <p>
 * 示例输入
 * Ihave1nose2hands10fingers
 * 输出
 * 0112Iaadeeefghhinnnorsssv
 **/
public class HJ34_S_CharSortTest {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String str = sc.nextLine();
      char[] ch = str.toCharArray();
      Arrays.sort(ch);
      for (char c : ch) {
        System.out.print(c);
      }
      System.out.println();
    }

  }
}
