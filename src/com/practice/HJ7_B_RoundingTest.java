package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-20 22:22
 * 需求：写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 **/
public class HJ7_B_RoundingTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float num = scan.nextFloat();
    System.out.println(getInt(num));

    System.out.println("***********************************");
    // # Solution 2
    Scanner reader = new Scanner(System.in);
    String s = reader.nextLine();
    int i = s.indexOf(".");
    Integer pre = Integer.parseInt(s.substring(0, i));
    Integer pre2 = Integer.parseInt(s.substring(i + 1, i + 2));
    if (pre2 >= 5) {
      pre += 1;
    }
    System.out.println(pre);
  }

  public static int getInt(float a) {
    int b = (int) a;
    if ((a - b) >= 0.5)
      return (b + 1);
    else
      return b;
  }


}
