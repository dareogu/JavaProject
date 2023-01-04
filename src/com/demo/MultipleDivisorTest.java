package com.demo;

/**
 * 最大公约数和最小公倍数
 *
 * @author Dareo_Gu
 */
public class MultipleDivisorTest {
  public static int divi(int a, int b) {
    int gongyue = a >= b ? b : a;
    while (a % gongyue != 0 || b % gongyue != 0) {
      gongyue--;
    }
    return gongyue;
  }

  public static int multi(int a, int b) {
    return a * b / divi(a, b);
  }

  public static void main(String[] args) {
    int k = multi(14, 7); //公倍数
    System.out.println(k);
    int w = divi(15, 6);  //公约数
    System.out.println(w);
  }
}
