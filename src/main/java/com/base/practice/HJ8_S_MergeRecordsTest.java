package com.base.practice;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 15:12
 * <p>
 * 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 * 示例输入
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 * 0 3
 * 1 2
 * 3 4
 **/
public class HJ8_S_MergeRecordsTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, Integer> map = new TreeMap<>();
    while (sc.hasNext()) {
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        int key = sc.nextInt();
        int value = sc.nextInt();
        map.put(key, map.getOrDefault(key, 0) + value);
      }
      for (Integer i : map.keySet()) {
        System.out.println(i + " " + map.get(i));
      }
    }
  }
}
