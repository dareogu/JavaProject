package com.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUserTest {
  public static void main(String[] args) {
    //创建hashmap对象
    HashMap<Integer, User> hm = new HashMap<Integer, User>();
    //添加键值的映射关系
    hm.put(1, new User("tom", "男"));
    hm.put(2, new User("vicky", "女"));
    hm.put(3, new User("geoffrey", "男"));
    //如果此映射包含对于指定键的映射关系，则返回true
    System.out.println(hm.containsKey(1));

    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

    //遍历
    Set<Map.Entry<Integer, User>> entities = hm.entrySet();
    Iterator<Map.Entry<Integer, User>> iter = entities.iterator();
    while (iter.hasNext()) {
      Map.Entry<Integer, User> ent = iter.next();
      System.out.println(ent.getKey() + ":" + ent.getValue());
    }
  }

  private static class User {
    String name;//姓名
    String sex;//性别

    public User(String name, String sex) {
      super();
      this.name = name;
      this.sex = sex;
    }

    @Override
    public String toString() {
      return "User[name=" + name + ",sex=" + sex + "]";
    }
  }
}