package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 16:58
 * <p>
 * 有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
 * 例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
 * 一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
 * 数据范围：输入满足 1≤n≤31  兔子数量满足斐波那契数列
 **/
public class HJ37_S_FibonacciRabbitTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int n = sc.nextInt();
      System.out.println(counts(n));
    }
  }

  public static int counts(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return counts(n - 1) + counts(n - 2);
  }
}
