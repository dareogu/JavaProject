package com.dareo.learn;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
  public static void main(String[] args) {
    List ls = new ArrayList();
    System.out.println(ls.getClass());
    System.out.println(Person.class);
    Person p = new Person("小明");
    System.out.print(p.getName());
    p.run();
    p.sing();
  }

  public static class Person {
    String name;

    public Person(String name) {
      super();
      this.name = name;
    }

    private void run() {
      System.out.println("我在跑步");
    }

    private void sing() {
      System.out.println("我在唱歌");
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}