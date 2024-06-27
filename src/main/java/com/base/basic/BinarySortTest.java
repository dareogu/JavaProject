package com.base.basic;

/**
 * 二分法查询元素在数组中的位置（已经排序好的）
 *
 * @author Dareo_Gu
 * 2017-11-16
 */
public class BinarySortTest {
  public static void main(String[] args) {
    int[] sortedArray = {1, 2, 3, 6, 10, 15, 16, 21, 25, 31};
    int num = 25;
    System.out.println(binarySort(sortedArray, num));
  }

  public static int binarySort(int[] array, int num) {
    if (array.length == 0) {
      return -1;
    }
    int startpos = 0;
    int endpos = array.length - 1;
    int midpos = (startpos + endpos) / 2;

    while (startpos <= endpos) {
      if (num == array[midpos]) {
        return midpos;
      } else if (num < array[midpos]) {
        endpos = midpos - 1;
      } else {
        startpos = midpos + 1;
      }
      midpos = (startpos + endpos) / 2;
    }
    return -1;
  }
}
