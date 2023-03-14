package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 15:33
 * <p>
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 输入描述：
 * 第一行输入数组元素个数
 * 第二行输入待排序的数组，每个数用空格隔开
 * 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
 * <p>
 * 输出描述：
 * 输出排好序的数字
 **/
public class HJ101_B_ArraySortTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int n = sc.nextInt();//接收数组长度
      int[] arr = new int[n];//创建数组

      for (int i = 0; i < n; i++) {//数组填入
        arr[i] = sc.nextInt();
      }

      int flag = sc.nextInt();//接收排序标识
      Arrays.sort(arr);//数组排序

      if (flag == 0) {//正序输出
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
      } else { //逆序输出
        for (int i = arr.length - 1; i >= 0; i--) {
          System.out.print(arr[i] + " ");
        }
      }
    }
  }
}
