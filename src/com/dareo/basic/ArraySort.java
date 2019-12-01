package com.dareo.basic;

public class ArraySort {
  public static void main(String[] args) {
    for (int i = 10; i < 100; i++) {
      if (8 * i >= 10 && 8 * i < 100
          && 9 * i >= 100 && 9 * i < 1000) {
        System.out.println("?? =" + i);
        System.out.println("809*??=" + 809 * i);
        System.exit(0);
      }
    }
  }
}