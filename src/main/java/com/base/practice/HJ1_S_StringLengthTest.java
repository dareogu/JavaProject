package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-12 17:32
 * 需求：计算字符串最后一个单词的长度，单词以空格隔开。 输入描述：一行字符串，非空，长度小于5000。q输出描述: 整数N，最后一个单词的长度
 * 输入： hello world
 * 输出：5
 **/
public class HJ1_S_StringLengthTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    System.out.println(str.length() - 1 - str.lastIndexOf(" "));
  }
}
