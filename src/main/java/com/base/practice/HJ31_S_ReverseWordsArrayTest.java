package com.base.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 15:55
 * <p>
 * 对字符串中的所有单词进行倒排。
 * 说明：
 * 1、构成单词的字符只有26个大写或小写英文字母；
 * 2、非构成单词的字符均视为单词间隔符；
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * 4、每个单词最长20个字母；
 **/
public class HJ31_S_ReverseWordsArrayTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String test = sc.nextLine();

    char[] ch = test.toCharArray();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < ch.length; i++) {
      if (Character.isLetter(ch[i])) {
        sb.append(ch[i]);
      } else {
        if (i != 0 || sb.lastIndexOf(" ") != i - 1) { //第一位和最后一位即使是非字母也不需要做什么
          sb.append(" ");
        }
      }
    }
    String[] arr = sb.toString().split(" ");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
