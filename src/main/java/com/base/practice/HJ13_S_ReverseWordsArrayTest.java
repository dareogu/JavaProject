package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 22:51
 * <p>
 * 需求：将一个英文语句以单词为单位逆序排放。例如“I am a boy”，
 * 逆序排放后为“boy a am I”所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * <p>
 * 输入描述:将一个英文语句以单词为单位逆序排放。
 * 输出描述:得到逆序的句子
 * <p>
 * 案例：
 * 输入：I am a boy
 * 输出：boy a am I
 **/
public class HJ13_S_ReverseWordsArrayTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String res = reverse(str);
    System.out.println(res);
  }

  public static String reverse(String str) {
    String[] s = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = s.length - 1; i > 0; i--) {
      sb.append(s[i]);
      sb.append(" ");
    }
    sb.append(s[0]);
    return sb.toString();
  }
}
