package com.base.basic;

import java.util.Arrays;

/**
 * 已经排序好的数组进行归并
 *
 * @author Dareo_Gu
 * 2017-11-18
 */
public class ArrayMergeAnotherTest {
  public static void main(String[] args) {
    int[] a = {9, 11, 16, 28, 67, 75};
    int[] b = {8, 26, 30, 48, 56, 66, 93, 97, 99};
    int[] c = new int[a.length + b.length];
    for (int cIndex = 0, aIndex = 0, bIndex = 0; cIndex < c.length; cIndex++) {
      if (aIndex >= a.length) {
        c[cIndex] = b[bIndex++];
      } else if (bIndex >= b.length) {
        c[cIndex] = a[aIndex++];
      } else if (a[aIndex] < b[bIndex]) {
        c[cIndex] = a[aIndex++];
      } else {
        c[cIndex] = b[bIndex++];
      }
    }
    System.out.println(Arrays.toString(c));
  }
}
