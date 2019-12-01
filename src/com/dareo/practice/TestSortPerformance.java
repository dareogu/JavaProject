package com.dareo.practice;

import java.util.Arrays;
import java.util.Random;

public class TestSortPerformance {
  public static void main(String[] args) {
    int[] a = new int[1000];
    for (int i = 0; i < a.length; i++) {
      Random r = new Random();
      a[i] = r.nextInt(1000);  //随机，可能有重复
      System.out.print(a[i] + " ");
    }
    System.out.println();
    //获取1970年开始至今的毫秒数
    long start = System.currentTimeMillis();
    Arrays.sort(a);
    long end = System.currentTimeMillis();
    System.out.println(end - start);
    System.out.println("排序后为：");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

  }
}
