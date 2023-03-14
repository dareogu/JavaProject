package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-15 00:43
 * 需求:输入一个正整数，按照从小到大的顺序输出它的所有质因子（如180的质因子为 2 2 3 3 5），最后一个数后面也要有空格
 **/
public class HJ6_S_DecomposeTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long value = sc.nextLong();
    if (value < 2) {
      sc.close();
      return;
    }
    decomposeValue(value);
    System.out.println();
    String result = decompose(value);
    System.out.println(result);
    sc.close();
  }

  public static String decompose(long dataInput) {
    StringBuilder str = new StringBuilder();
    int index = 2;
    while (index <= dataInput) {
      if (dataInput % index == 0) {
        if (index == dataInput) {
          str.append(index).append(" ");
          break;
        } else {
          str.append(index).append(" ");
          dataInput = dataInput / index;
        }
      } else {
        index++;
      }
    }
    return str.toString();
  }

  //# Solution 2
  public static void decomposeValue(long dataInput) {
    int index = 2;
    while (index <= dataInput) {
      if (dataInput % index == 0) {
        System.out.print(index);
        if (dataInput == index) {
          break;
        }
        dataInput = dataInput / index;
        System.out.print("*");
      } else {
        index++;
      }
    }
  }
}
