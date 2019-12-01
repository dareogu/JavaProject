package com.dareo.learn;

/**
 * 二分法查询元素在数组中的位置（已经排序好的）
 *
 * @author Dareo_Gu
 * 2017-11-16
 */
public class TestSort {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 6, 10, 15, 16, 21, 25, 31};
    int num = 25;
    System.out.println(BinarySort(a, num));
  }

  public static int BinarySort(int[] a, int num) {
    if (a.length == 0) {
      return -1;
    }
    int startpos = 0;
    int endpos = a.length - 1;
    int midpos = (startpos + endpos) / 2;

    while (startpos <= endpos) {
      if (num == a[midpos]) {
        return midpos;
      } else if (num < a[midpos]) {
        endpos = midpos - 1;
      } else {
        startpos = midpos + 1;
      }
      midpos = (startpos + endpos) / 2;
    }
    return -1;
  }
}
