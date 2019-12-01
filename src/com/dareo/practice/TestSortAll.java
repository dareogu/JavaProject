package com.dareo.practice;

import java.util.Arrays;

/**
 * 排序算法合集
 *
 * @author Dareo_Gu
 */
public class TestSortAll {
  public static void main(String[] args) {
    int[] a = {3, 5, 1, 8, 9, 6, 33, 44, 4, 10, 25, 12, 4, 11};
    SelectSort(a);
    //BubbleSort(a);
    System.out.println(Arrays.toString(a));
  }

  //选择排序
  public static void SelectSort(int[] a) {
    int temp = 0;
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[i]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
      //System.out.print(a[i]+" ");
    }
  }

  //冒泡排序
  public static void BubbleSort(int[] a) {
    int temp = 0;
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
      }
      //System.out.print(a[i]+" ");
    }
  }
}
