package com.base.demo;

public class FibonacciValueTest {
  public static void main(String[] args) {
    System.out.println(fibonacci(13));
  }

  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    int f1 = 1;
    int f2 = 1;
    int f = 0;
    for (int i = 0; i < n - 2; i++) {
      f = f1 + f2;
      f1 = f2;
      f2 = f;
    }
    return f;
  }
}