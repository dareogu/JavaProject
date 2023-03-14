package com.demo;

import java.util.*;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-05 17:24
 **/
public class CharCountTopTest {
  public static void main(String[] args) {
    System.out.print("请输入一个字符串以及字符统计最多的个数：");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    Scanner countSize = new Scanner(System.in);
    int k = countSize.nextInt();
    getCharCounts(str, k);
  }

  private static void getCharCounts(String str, int count) {
    Map<Character, Integer> charVsCount = new TreeMap<>();
    for (char c : str.toCharArray()) {
      charVsCount.put(c, charVsCount.getOrDefault(c, 0) + 1);
    }
    List<Map.Entry<Character, Integer>> list = new ArrayList<>(charVsCount.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
      @Override
      public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        if (o1.getValue() == o2.getValue()) {
          return o1.getKey().compareTo(o2.getKey());
        }
        return o2.getValue() - o1.getValue();
      }
    });
    if (count >= list.size()) {
      list.stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    } else {
      for (int i = 0; i < count; i++) {
        Map.Entry<Character, Integer> entry = list.get(i);
        System.out.println(entry.getKey() + ":" + entry.getValue());
      }
    }
  }
}
