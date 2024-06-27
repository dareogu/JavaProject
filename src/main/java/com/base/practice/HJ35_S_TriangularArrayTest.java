package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-02-20 11:32
 * <p>
 * 打印类似如下的列表
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 **/
public class HJ35_S_TriangularArrayTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int level = in.nextInt();
      printTriangularArray(level);
    }
  }

  private static void printTriangularArray(int level) {
    StringBuilder res = new StringBuilder();
    int[][] arr = new int[level][level];
    int count = 1;
    for (int i = 0; i < level; i++) {
      // 从左下到右上的斜顺序构造数组
      for (int j = i; j >= 0; j--) {
        arr[j][i - j] = count++;
      }
    }
    // 封装结果
    for (int i = 0; i < arr.length; i++) {
      // 只需要遍历非0的元素
      for (int j = 0; j < arr.length - i; j++) {
        res.append(arr[i][j] + " ");
      }
      // 对每一行最后添加换行符
      if (i != level - 1) {
        res.append("\n");
      }
    }
    System.out.println(res);
  }
}
