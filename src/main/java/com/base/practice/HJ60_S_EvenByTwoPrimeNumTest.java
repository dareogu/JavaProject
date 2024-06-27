package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 21:02
 * <p>
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
 *
 * Java简便解法，直接从中间开始取
 **/
public class HJ60_S_EvenByTwoPrimeNumTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int n = sc.nextInt();
      int l = n / 2;
      int r = n / 2;

      while (l > 2 && r < n - 2) {
        if (isPrime(l) && isPrime(r) && l + r == n) {
          break;
        } else {
          l--;
          r++;
        }
      }
      System.out.println(l);
      System.out.println(r);
    }
  }


  private static boolean isPrime(int n) {
    if (n <= 2) return false;
    for (int i = 2; i < n; i++)
      if (n % i == 0) return false;
    return true;
  }
}
