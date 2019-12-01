package com.dareo.demo;

import java.util.Scanner;

public class CheckPrimeTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PrimeJduge(n);
    sc.close();
  }

  public static void PrimeJduge(int n) {
    boolean flag = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        flag = false;
        break;
      }
    }
    if (flag == false) {
      System.out.println(n + "是非质数");
    } else {
      System.out.println(n + "是质数");
    }
  }
}
