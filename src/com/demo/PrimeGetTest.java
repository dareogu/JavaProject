package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试选择出100到n之间的质数并依次打印出来
 *
 * @author Dareo_Gu 2017-11-18
 */
public class PrimeGetTest {
  public static void main(String[] args) {
    primeSelect(200);
  }

  public static void primeSelect(int n) {
    int x = 0;
    List<Integer> v = new ArrayList<Integer>();//集合,用来装所有的素数
    for (int i = 101; i <= n; i++) {
      boolean b = true;//预设都为真，即都是素数
      for (int j = 2; j < Math.sqrt(i); j++) {
        if (i % j == 0)//求余数是否为0，为0为合数
        {
          b = false;//如果为0, 将标签设置为false
          break;    //可以整除就跳出这个循环
        }
      }
      if (b == true)//
      {
        v.add(i);//将符合要求的i加到集合里
        x++; // 素数个数加1
      }
    }
    System.out.println("100到" + n + "中间有 " + x + " 个素数");
    System.out.println("素数分别为:\n" + v);
  }
}
