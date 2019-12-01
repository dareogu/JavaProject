package com.dareo.practice;

/**
 * 最大公约数和最小公倍数
 *
 * @author Dareo_Gu
 */
public class TestMultipleDivisor {
  public static int Divi(int a, int b) {
    int gongyue = a;
    while (a % gongyue != 0 || b % gongyue != 0) {
      gongyue--;
    }
    return gongyue;
  }

  public static int Multi(int a, int b) {
    return a * b / Divi(a, b);
  }

  public static void main(String[] args) {
    int k = Multi(14, 7);
    System.out.println(k);
    int w = Divi(15, 6);
    System.out.println(w);
  }
}
