package com.base.basic;

/**
 * 测试阶乘递归求和
 *
 * @author Dareo_Gu
 * 2017-11-17
 */
public class RecursionTest {
  public static void main(String[] args) {
    System.out.println(factorialValue(10));   //求阶乘
    getSum(23);   //阶乘的和
  }

  public static long factorialValue(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorialValue(n - 1);
    }
  }

  public static void getSum(int n) {
    long sum = 0; //long数据类型能运算的范围更大
    for (int i = 1; i <= n; i++) {
      sum += factorialValue(i);
    }
    System.out.println("1到" + n + "的阶乘求和为：" + sum);
  }
}
