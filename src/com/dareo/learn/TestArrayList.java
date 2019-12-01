package com.dareo.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList，帮忙更好理解ArrayList类的底层结构！
 *
 * @author Dareo_Gu
 */
public class TestArrayList {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(123);
    list.add("222");
    list.add(1, "ni");
    System.out.println(list);
  }

}