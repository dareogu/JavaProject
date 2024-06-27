package com.base.basic;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 12:28
 **/
public class ArrayDemoTest {
  public static void main(String[] args) {
    int[] numbers = new int[15];
    for (int j = 0; j < numbers.length; j++) {
      numbers[j] = (int) (Math.random() * j * Math.PI + 1);
    }

    for (int i = 0; i < numbers.length; i++) {
      if (i == 0) {
        System.out.print(numbers[i]);
      } else {
        System.out.print(",");
        System.out.print(numbers[i]);
      }
    }
  }
}
