package com.practice;

import java.util.*;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 15:50
 * <p>
 * 实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 **/
public class HJ23_S_RemoveMinCountsCharTest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String s = scanner.nextLine();
      char[] chars = s.toCharArray();
      //统计每个字母的数量
      Map<Character, Integer> map = new HashMap<>();
      for (char aChar : chars) {
        map.put(aChar, (map.getOrDefault(aChar, 0) + 1));
      }
      //找到数量最少的字符数量
      Collection<Integer> values = map.values();
      Integer min = Collections.min(values);

      //用空字符串替换该字母
      for (Character character : map.keySet()) {
        if (map.get(character) == min) {
          s = s.replaceAll(String.valueOf(character), "");
        }
      }
      System.out.println(s);
    }
  }
}
