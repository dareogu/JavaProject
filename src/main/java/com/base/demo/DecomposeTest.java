package com.base.demo;

import java.util.Scanner;

public class DecomposeTest {
  public static void decompose(int n) {
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i);
        if (n != i) {
          System.out.print("*");
        }
        decompose(n / i);
      }
    }
    System.exit(0); //退出程序
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入N的值：");
    int N = in.nextInt();
    System.out.print("分解质因数：" + N + "=");
    decompose(N);
    in.close();
  }
}
