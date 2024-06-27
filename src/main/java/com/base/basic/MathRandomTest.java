package com.base.basic;

public class MathRandomTest {

  private static boolean flag = true;

  public static void main(String[] args) {
    while (flag) {
      double d = Math.random();//[0,1)  返回0到1之间的小数
      int e = (int) (d * 5);  //[0,4],返回0到4的整数
      if (e >= 1) {
        System.out.println(e);
      } else {
        flag = false;
      }
    }

    float f = (float) Math.random();
    String s = Float.toString(f);
    System.out.println(s);
  }
}