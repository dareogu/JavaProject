package com.basic;

/**
 * 正则表达式：统计一个字符串中有多少个java
 *
 * @author Dareo_Gu
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
  public static void main(String[] args) {
    Pattern pa = Pattern.compile("Java", Pattern.CASE_INSENSITIVE); //忽略大小写
    Matcher ma = pa.matcher("javahJavaJavAkjfJaVAjavavaJAVAjaVAto");
    int count = 0;
    while (ma.find()) {
      count++;
      System.out.println(ma.group());  //返回类型数组，找到匹配的字符串
    }
    System.out.println(count); //打印找到的个数
  }
}
