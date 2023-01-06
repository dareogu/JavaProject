package com.demo;

/**
 * Created by IntelliJ IDEA.
 * @author: Dareo_Gu
 * @Created: 2023/1/6 23:00
 */
public class SumRepeatValuesTest {
  public static int repeatNumValue(int number, int count) {
    if (count == 1) {
      return number;
    } else {
      return (int) (repeatNumValue(number, count - 1) + number * Math.pow(10, count - 1));
    }
  }

  public static void sumRepeatNumValues(int num, int count) {
    int sum = 0;
    for (int i = 1; i <= count; i++) {
      sum += repeatNumValue(num, i);
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    System.out.println(repeatNumValue(2, 5)); //22222
    sumRepeatNumValues(2, 5); //22222+2222+222+22+22+2
  }
}
