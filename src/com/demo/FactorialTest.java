package com.demo;

/**
 * 写一个从1到n阶乘相加求和的方法
 *
 * @author Dareo_Gu
 * 创建时间：2017-09-23
 */
public class FactorialTest {
  //求n的阶乘
  public static int factorial(int i) {
    int njc = 0;
    if (i == 1) {
      return 1;
    } else {
      njc = i * factorial(i - 1);
    }
    return njc;
  }

  //求和方法
  public static void sumFactorial(int i) {
    int sum = 0;
    for (int k = 1; k <= i; k++) {
      sum += factorial(k);
    }
    System.out.println("1到" + i + "的阶乘求和为：" + sum);
  }

  public static void main(String[] args) {
    sumFactorial(3);
  }
}
