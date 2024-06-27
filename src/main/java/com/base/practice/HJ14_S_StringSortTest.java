package com.base.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-24 22:55
 * <p>
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * <p>
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * <p>
 * 案例
 * 输入：
 * 9
 * cap
 * to
 * cat
 * card
 * two
 * too
 * up
 * boat
 * boot
 * <p>
 * 输出：
 * boat
 * boot
 * cap
 * card
 * cat
 * to
 * too
 * two
 * up
 */
public class HJ14_S_StringSortTest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    int num = scan.hasNextLine() ? Integer.parseInt(scan.nextLine()) : 0;
    while (--num >= 0 && scan.hasNextLine()) {
      String s = scan.nextLine();
      list.add(s);
    }
    Collections.sort(list);
    list.forEach(str -> System.out.println(str));
  }
}
