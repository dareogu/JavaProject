package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 23:09
 * 题目描述：
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * <p>
 * 输入描述: 输入一个整数（int类型）
 * 输出描述: 这个数转换成2进制后，输出1的个数
 * <p>
 * 案例：
 * 输入：5
 * 输出：2
 **/
public class HJ15_S_NumberOneCountTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    while (sc.hasNext()) {
//      int n = sc.nextInt();
//      int count = 0;
//      while (n != 0) {
//        count++;
//        n = n & (n - 1);
//      }
//      System.out.println(count);
//    }

    //# Solution 2
    while (sc.hasNext()) {
      String n = Integer.toBinaryString(sc.nextInt());
      int count = 0;
      for (char c : n.toCharArray()) {
        if (c == '1') {
          count++;
        }
      }
      System.out.println(count);
    }

  }
}
