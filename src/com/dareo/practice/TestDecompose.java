package com.dareo.practice;

import java.util.Scanner;

public class TestDecompose {
  public static void Decompose(int n) {
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i);
        if (n != i) {
          System.out.print("*");
        }
        Decompose(n / i);
      }
    }
    System.exit(0); //退出程序
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入N的值：");
    int N = in.nextInt();
    System.out.print("分解质因数：" + N + "=");
    Decompose(N);
    in.close();
  }
}
