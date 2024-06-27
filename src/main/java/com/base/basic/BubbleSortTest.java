package com.base.basic;

import java.util.Arrays;

//冒泡排序法
//它重复地走访过要排序的元素列，依次比较两个相邻的元素，如果顺序（如从大到小、首字母从Z到A）错误就把他们交换过来。
//走访元素的工作是重复地进行，直到没有相邻元素需要交换，也就是说该元素列已经排序完成
public class BubbleSortTest {
  public static void main(String[] args) {
    int[] arr = {11, 9, 5, 3, 2, 8, 10, 22, 20, 30};
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.print(Arrays.toString(arr) + " ");
  }
}
