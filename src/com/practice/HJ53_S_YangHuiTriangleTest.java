package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 18:13
 * <p>
 * 第一行只有一个数1，以下每行的每个数，是恰好是它上面的数、左上角数和右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3，输入2则输出-1。
 * 数据范围：1≤n≤10
 **/
public class HJ53_S_YangHuiTriangleTest {
  /***
   *
   *这题不难，就是看规律。
   *1、如果是第一行和第二行，直接输出-1。
   *2、可以看出规律，奇数行的的第二位数值都是偶数。
   *3、另外，可以发现4的倍数行，第三位数值都是偶数。
   *4、其余，第四位数值都是偶数。
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int num = sc.nextInt();
      if (num == 1 || num == 2) {
        System.out.println(-1);
      } else {
        if (num % 2 == 1) {
          System.out.println(2);
        } else if (num % 4 == 2) {
          System.out.println(4);
        } else {
          System.out.println(3);
        }
      }
    }
  }

}
