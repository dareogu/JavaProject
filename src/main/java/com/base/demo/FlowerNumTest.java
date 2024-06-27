package com.base.demo;

public class FlowerNumTest {
  public static void main(String[] args) {
    for (int i = 100; i < 999; i++) {
      if (isFlowerNum(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isFlowerNum(int i) {
    int a, b, c;
    a = i / 100;
    b = (i % 100) / 10;
    c = i % 10;
    return i == (a * a * a + b * b * b + c * c * c);
  }
}
