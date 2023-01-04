package com.basic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dareo_Gu
 */
public class ArrayListTest {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(123);
    list.add("222");
    list.add(1, "ni");
    System.out.println(list);
  }

}