package com.base.basic;
/**
 * 测试遍历Iterator
 *
 * @author Dareo Gu
 * 2017-10-21
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
  public static void main(String[] args) {
    Collection list = new ArrayList();
    list.add("abc");
    list.add("hello");
    list.add(new Integer(100));
    list.add(new Name("wo", "men"));
    System.out.println(list);
    for (Iterator itr = list.iterator(); itr.hasNext(); ) {//遍历输入数组中的所有元素
      Object o = itr.next();
      System.out.println(o);
    }

    System.out.println("====================================");

    Iterator itr = list.iterator();
    while (itr.hasNext()) {//遍历输入数组中的所有元素2
      Object o = itr.next();
      System.out.println(o);
    }
  }

  private static class Name {
    String firstName, lastName;

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public String toString() {
      return firstName + " " + lastName;
    }
  }

}