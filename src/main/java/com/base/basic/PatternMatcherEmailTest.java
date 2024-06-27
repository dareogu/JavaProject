package com.base.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 11:51
 **/
public class PatternMatcherEmailTest {
  public static void main(String[] args) {
    // 要验证的字符串
    String str = "service@xsoftlab.net.jkfdj.jkfldja";
    // 邮箱验证规则
    String regEx = "[a-zA-Z0-9]{1,}@(([a-zA-Z0-9]){1,}\\.){1,3}[a-zA-z]{1,}";
    // 编译正则表达式
    Pattern pattern = Pattern.compile(regEx);
    // 忽略大小写的写法
    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(str);
    // 字符串是否与正则表达式相匹配
    boolean rs = matcher.matches();
    System.out.println(rs);
  }
}
