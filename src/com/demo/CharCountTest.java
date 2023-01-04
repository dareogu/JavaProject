package com.demo;

/**
 * 统计一个字符串中字符出现的个数
 *
 * @author Dareo_Gu
 * 2017-12-10
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharCountTest {
  public static void main(String[] args) {
    String str = "kfjdkljskldfsafsda32132fdsjhf jdlkaj fdsafdsa54fsda fds,";
    charCount(str);
  }

  public static void charCount(String str) {
    char[] chars = str.toCharArray();
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (char c : chars) {
      if (!map.containsKey(c)) {
        map.put(c, 1);
      } else {
        map.put(c, map.get(c) + 1);
      }
    }
    //keySet()取值方法,先获取map集合的所有键的set集合
//     for(Character key:map.keySet()){
//    	 System.out.println(key+": "+map.get(key));
//     }

    //entrySet()取值方式，将Map集合中的映射关系取出，存入到Set集合中
    Set<Map.Entry<Character, Integer>> set = map.entrySet();
    for (Iterator<Map.Entry<Character, Integer>> itr = set.iterator(); itr.hasNext(); ) {
      Map.Entry<Character, Integer> cc = itr.next();
      char c = cc.getKey();
      int count = cc.getValue();
      System.out.println(c + " :" + count);
    }
  }
}