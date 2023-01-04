package com.demo;

/**
 * 正则表达式：给出一个指定的字符串，字符串中有若干个单词，判断单词的排列模式
 *
 * @author Dareo_Gu
 * 太平人寿面试题
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternJudgeTest {

  public static void main(String[] args) {
    String str = "Fish fish Cat cAt cat";
    String[] strs = str.split(" ");

    int j = 0;
    for (int i = 0; i < strs.length; i++) {
      Pattern p = Pattern.compile(strs[i], Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(str);
      while (m.find()) {
        str = m.replaceAll(Character.toString((char) ('a' + j)));
        j++;
      }
    }
    System.out.println(str.replaceAll(" ", ""));
  }
}
