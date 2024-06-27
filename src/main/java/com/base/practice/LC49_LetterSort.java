package com.base.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-09 16:41
 **/
public class LC49_LetterSort {

  public static void main(String[] args) {
    String[] strings = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(strings));
  }

  private static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> keyVsWords = new HashMap<>();
    for (String word : strs) {
      char[] sort = word.toCharArray();
      Arrays.sort(sort);
      String sorted = String.valueOf(sort);
      if (!keyVsWords.containsKey(sorted)) {
        keyVsWords.put(sorted, new ArrayList<>());
        keyVsWords.get(sorted).add(word);
      } else {
        keyVsWords.get(sorted).add(word);
      }
    }
    return new ArrayList<>(keyVsWords.values());
  }
}
