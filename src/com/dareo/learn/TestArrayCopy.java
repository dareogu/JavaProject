package com.dareo.learn;

import java.util.Arrays;

public class TestArrayCopy {
  public static void main(String[] args) {
    int temp1[] = {1, 4, 51, 6, 30, 44, 2, 21, 56};
    int temp2[] = {20, 3, 21, 5, 8, 7, 19};
    System.arraycopy(temp1, 0, temp2, 2, 3);
    for (int temp : temp2) {
      System.out.println(temp + ",");
    }
    System.out.println(Arrays.toString(temp2));
    int[] temp3 = Arrays.copyOf(temp1, 6); //另外一个copy数组的方法
    System.out.println(Arrays.toString(temp3));
  }
}
