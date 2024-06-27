package com.base.basic;

public class BreakContinueTest {
  public static void main(String[] args) {
    int total = 0;
    System.out.println("Begin：");
    while (true) {
      total++;
      int i = (int) Math.round(Math.random() * 100);
      if (i == 88) {   //等于88跳出所有循环
        break;  //满足条件跳出所有循环
      }
    }
    System.out.println("一共循环次数：" + total);

    //打印100到150之间不被3整除的数
    for (int j = 100; j < 150; j++) {
      if (j % 3 == 0) {
        continue; //结束本次循环，继续下一次
      }
      System.out.println(j);
    }
    System.out.println("====================================");

    //把101到200之间的质数输出
    outer:
    for (int i = 101; i < 200; i++) {
      for (int k = 2; k < i / 2; k++) {
        if (i % k == 0) {
          continue outer;  //带标签的continue用法。满足条件，跳出本次循环，继续outer标签所在的循环
        }
      }
      System.out.println(i);
    }
  }
}