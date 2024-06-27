package com.base.basic;

import java.util.Arrays;
import java.util.Random;

public class ArraySortPerfTest {
  public static void main(String[] args) {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      Random r = new Random();
      array[i] = r.nextInt(3000);  //随机，可能有重复
      System.out.print(array[i] + ",");
    }
    System.out.println();
    //获取1970年开始至今的毫秒数
    long start = System.currentTimeMillis();
    Arrays.sort(array);
    long end = System.currentTimeMillis();
    System.out.println("排序耗时为：" + (end - start) + " 毫秒");
    System.out.println("排序后为：");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ",");
    }
  }
}
