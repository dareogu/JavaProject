package com.dareo.basic;

//冒泡排序法
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {1, 9, 5, 3, 2, 8, 10, 22, 20, 30};
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      System.out.print(arr[i] + " ");
    }
  }
}
