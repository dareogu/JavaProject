package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static Map<Character, Character> map = new HashMap<>();

  static {
    map.put('0', '0');
    map.put('1', '8');
    map.put('2', '4');
    map.put('3', 'C');
    map.put('4', '2');
    map.put('5', 'A');
    map.put('6', '6');
    map.put('7', 'E');
    map.put('8', '1');
    map.put('9', '9');
    map.put('a', '5');
    map.put('b', 'D');
    map.put('c', '3');
    map.put('d', 'B');
    map.put('e', '7');
    map.put('f', 'F');
    map.put('A', '5');
    map.put('B', 'D');
    map.put('C', '3');
    map.put('D', 'B');
    map.put('E', '7');
    map.put('F', 'F');
  }

  public static void main(String[] args) {

    //标准输入
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {

      String str1 = sc.next();
      String str2 = sc.next();
      char[] str = (str1 + str2).toCharArray();
      char[] even = new char[str.length / 2];
      char[] odd = new char[str.length - str.length / 2];
      for (int i = 0, j = 0, k = 0; i < str.length; i++) {
        if (i % 2 == 0) {
          even[j] = str[i];
          j++;
        } else {
          odd[k] = str[i];
          k++;
        }
      }
      Arrays.sort(even);
      Arrays.sort(odd);

      for (int i = 0, j = 0, k = 0; i < str.length; i++) {
        if (i % 2 == 0) {
          str[i] = map.getOrDefault(even[j], even[j]);
          j++;
        } else {
          str[i] = map.getOrDefault(odd[k], even[k]);
          k++;
        }
      }
      System.out.print(str);

    }
  }

}
