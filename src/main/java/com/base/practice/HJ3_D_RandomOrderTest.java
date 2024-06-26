package com.base.practice;

import java.util.TreeSet;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-13 17:13
 * <p>
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)
 **/
public class HJ3_D_RandomOrderTest {

  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    while (set.size() < 20) {
      int randomValue = (int) (Math.random() * 1000 + 1);
      //向TreeSet添加元素的时候，都会调用CompareTo()方法进行排序，该方法是Comparable接口里面定义的，
      //因此想要对元素中的方法进行排序，就必须实现这个接口，Java中大部分类都已经实现了这个接口，如Integer，Double和String等
      set.add(randomValue);
    }
    for (Integer i : set) {
      System.out.println(i); //TreeSet输出默认按照自然顺序排序
    }
  }
}
