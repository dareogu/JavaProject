package com.dareo.practice;

public class TestFibonacciSum {
  public static void main(String[] args) {
    System.out.println(fibonacci(13));
  }

  // public static int fibonacci(int n) {
  // int fibonacciValue=0;
  // if (n == 0) {
  // return 1;
  // } else if (n == 1) {
  // return 1;
  // } else {
  // fibonacciValue=fibonacci(n - 1) + fibonacci(n - 2);
  // return fibonacciValue;
  // }

  public static long fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    long f1 = 1l;
    long f2 = 1l;
    long f = 0;
    for (int i = 0; i < n - 2; i++) {
      f = f1 + f2;
      f1 = f2;
      f2 = f;
    }
    return f;
  }
}