package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 22:48
 * <p>
 * 需求：写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 **/
public class Interview_11_ReverseTest {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String s = in.nextLine();
      byte[] b = s.getBytes();
      for (int i = b.length - 1; i >= 0; i--) {
        System.out.print((char) b[i]);
      }
    }

  }
}
