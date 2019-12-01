package com.dareo.practice;
/**
 * 递归求汉诺塔移动总步数
 * <p>
 * 实现这个算法可以简单分为三个步骤：
 * 把n-1个盘子由 A 移到 B；
 * 把第n个盘子由 A 移到 C；
 * 把n-1个盘子由 B 移到 C；
 * <p>
 * 2017-11-17
 */

import java.util.Scanner;

public class SimpleTowersOfHanoi {
  @SuppressWarnings("resource")  //用来压制资源泄露警告的。比如使用io类，最后没有关闭
  public static void main(String[] args) {
    System.out.print("请输入汉诺塔的个数：");
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    System.out.println(k + "个汉诺塔总共移动次数为：" + NumOfHnt(k));
  }

  public static int NumOfHnt(int n) {
    int sum = 0;
    if (n == 1) {
      return 1;
    } else
      sum = 2 * NumOfHnt(n - 1) + 1;
    return sum;
  }
}
