package com.basic;

import java.util.Arrays;

/**
 * 已经排序好的数组进行归并
 *
 * @author Dareo_Gu
 * 2017-11-18
 */
public class ArrayMergeTest {
  public static void main(String[] args) {
    int a[] = {9, 11, 16, 28, 67, 75};
    int[] b = {8, 26, 30, 48, 56, 66, 93, 97, 99};
    int[] c = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        c[k] = a[i];
        i++;
      } else {
        c[k] = b[j];
        j++;
      }
      k++;
    }
    if (i < a.length) {
      System.arraycopy(a, i, c, k, a.length - i);
    }
    if (j < b.length) {
      System.arraycopy(b, j, c, k, b.length - j);
    }
    System.out.println(Arrays.toString(c));
  }
}
