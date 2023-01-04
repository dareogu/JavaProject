package com.basic;

import java.util.Scanner;

/**
 * 测试Scanner，使用构造函数求和
 *
 * @author Dareo_Gu
 */
public class ScannerTest {
  public static int sum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.print("请输入一个整数：");
    int aa = a.nextInt();
    Scanner b = new Scanner(System.in);
    System.out.print("请再输入一个整数：");
    int bb = b.nextInt();
    int sum = sum(aa, bb);
    System.out.print("它们的和为：" + sum);
  }
}