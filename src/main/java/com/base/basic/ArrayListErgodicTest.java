package com.base.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListErgodicTest {
  public static void main(String[] args) {
    //集合对象
    List<String> elementList = new ArrayList<>();

    //添加元素
    elementList.add("我是一个超人");
    elementList.add("今天是一个好天气");
    elementList.add("Hello world!");
    elementList.add("九月与安生");

    //第一种遍历方式
    for (int i = 0; i < elementList.size(); i++) {
      String array = elementList.get(i);
      System.out.println(array);
    }

    System.out.println("====================================");
    elementList.remove(2); //删除第三个位置的String对象

    //采用迭代器进行遍历
    for (Iterator<String> it = elementList.iterator(); it.hasNext(); )//判断是否有下一个元素
    {
      String str = it.next(); //获取下一个元素的值
      System.out.println(str);
    }

    elementList.add(null);
    elementList.add("null");
    System.out.println("====================================");

    //第三种遍历方式
    Iterator<String> it2 = elementList.iterator();
    while (it2.hasNext()) {
      String str2 = it2.next();
      System.out.println(str2);
    }
  }
}