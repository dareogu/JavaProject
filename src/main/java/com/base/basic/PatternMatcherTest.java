package com.base.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 认识正则表达式
 * 20171111
 */

public class PatternMatcherTest {

  public static void main(String[] args) {
    //简单认识正则表达式
    System.out.println("abc".matches("..."));
    // 反斜杠\d代表数字，把所有的数字替换成-
    System.out.println("d465a35e".replaceAll("\\d", "-"));

    Pattern pt = Pattern.compile("[a-z]{3}");
    Matcher mt = pt.matcher("hdh");
    System.out.println(mt.matches());
    //以上三句可以用以下一句完成
    System.out.println("hdh".matches("[a-z]{3}"));

    //初步认识. * +  ？
    System.out.println("a".matches("a"));
    System.out.println("aaa".matches("a*")); //*代表0个或多个
    System.out.println("a".matches("a+"));  //+代表一个或多个
    System.out.println("".matches("a?")); //?代表1个或者0个
    System.out.println("1325321321".matches("\\d{1,30}")); //出现1到30个数字
    System.out.println("192.168.0.110".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
    System.out.println("192".matches("[0-2][0-9][0-9]")); //一位一位校验

    //范围
    System.out.println("a".matches("[absjhs]")); //匹配中括号里的一个字符
    System.out.println("a".matches("[^absjhs]")); //不匹配中括号里的任何一个字符
    System.out.println("A".matches("[a-zA-Z]")); //取a到z或者A到Z
    System.out.println("e".matches("[a-z]|[A-Z]")); //匹配a到z或者A到Z
    System.out.println("R".matches("[A-Z&&[O-V]]")); //取两者的交集
    System.out.println("R".matches("[A-Z&&[RFG]]")); //取两者的交集

  }
}