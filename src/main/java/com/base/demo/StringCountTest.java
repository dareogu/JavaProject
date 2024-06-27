package com.base.demo;

import java.util.HashMap;
import java.util.Map;

/***
 * @author Dareo_Gu
 * 2023-1-6
 * 对给定的一个字符串中的以逗号分隔的每个单词出现的次数做一个统计
 */
public class StringCountTest {

  public static void main(String[] args) {
    String str = "   ,be,be,asd,,be,,make,332,BE, ,asd,...";
    printWordCounts(str);
  }

  private static void printWordCounts(String str) {
    if (str != null) {
      String[] words = str.split(",");
      Map<String, Integer> wordVsCount = new HashMap<>();
      for (String element : words) {
        if (wordVsCount.containsKey(element)) {
          wordVsCount.put(element, wordVsCount.get(element) + 1);
        } else {
          wordVsCount.put(element, 1);
        }
      }
      wordVsCount.entrySet().forEach(entry -> System.out.println("Word: \"" + entry.getKey() + "\", Count: " + entry.getValue()));
    } else {
      System.out.println("Invalid String value: null");
    }
  }
}