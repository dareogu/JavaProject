package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:55
 **/
public class PatternMatcherDemoTest {

  //  public static void main(String[] args) {
//    String reg = "\\btest";
//    String input = "414jtestjf3jf testtest";
//    Pattern p =Pattern.compile(reg);
//    Matcher m = p.matcher(input);
//    if (m.find()) {
//      input=m.replaceAll(",");
//      System.out.println(input);
//    }else {
//    System.out.println("no match!");
//    }
//  }

  private static String REGEX = "a*b";
  private static String INPUT = "aabfooaabfooabfoobkkk";
  private static String REPLACE = "-";

  public static void main(String[] args) {
    Pattern p = Pattern.compile(REGEX);
    // 获取 matcher 对象
    Matcher m = p.matcher(INPUT);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(sb, REPLACE);
    }
    m.appendTail(sb);
    System.out.println(sb);
  }

}
