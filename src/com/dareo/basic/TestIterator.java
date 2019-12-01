package com.dareo.basic;
/**
 * 测试遍历Iterator
 *
 * @author Dareo Gu
 * 2017-10-21
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
  public static void main(String[] args) {
    Collection a = new ArrayList();
    a.add("abc");
    a.add("hello");
    a.add(new Integer(100));
    a.add(new Name("wo", "men"));
    System.out.println(a);
    //Iterator itr=a.iterator();
    for (Iterator itr = a.iterator(); itr.hasNext(); ) {//遍历输入数组中的所有元素
      Object o = itr.next();
      System.out.println(o);
    }
  }
}

class Name {
  String FirstName, LastName;

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public Name(String firstName, String lastName) {
    super();
    FirstName = firstName;
    LastName = lastName;
  }

  public String toString() {
    return FirstName + " " + LastName;
  }
}