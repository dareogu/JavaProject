package com.base.basic;

import java.util.Arrays;

/**
 * 排序算法合集
 *
 * @author Dareo_Gu
 */
public class SelectBubbleSortTest {
  public static void main(String[] args) {
    int[] array = {3, 5, 1, 8, 9, 6, 33, 44, 4, 10, 25, 12, 4, 11};
    selectSort(array);
    bubbleSort(array);
  }

  //选择排序
  public static void selectSort(int[] array) {
    int temp = 0;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[i]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.println("选择排序： " + Arrays.toString(array));
  }

  //冒泡排序
  public static void bubbleSort(int[] array) {
    int temp = 0;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.println("冒泡排序： " + Arrays.toString(array));
  }
}
