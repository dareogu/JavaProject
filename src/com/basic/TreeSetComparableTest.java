package com.basic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-13 23:02
 **/
public class TreeSetComparableTest {
  public static void main(String[] args) {
    TreeSet<Integer> intSet = new TreeSet<>();
    intSet.add(11);
    intSet.add(144);
    intSet.add(60);
    intSet.add(9);
    for (Integer element : intSet) {
      System.out.println(element);
    }

    //得到首个元素
    System.out.println("首个元素：" + intSet.first());
    //lower返回集合中小于给定元素的最大值，没有就返回null
    System.out.println("小于100的最大元素是：" + intSet.lower(100));
    //pollFirst 移除并返回集合的第一个元素
    System.out.println("移除并返回集合的第一个元素:" + intSet.pollFirst());
    for (Integer element : intSet) {
      System.out.println(element);
    }
    System.out.println("====================================");

    TreeSet<String> stringSet = new TreeSet<>();
    stringSet.add("dog");
    stringSet.add("apple");
    stringSet.add("cat");
    stringSet.add("even");
    stringSet.add("boy");

    Iterator<String> stringIterator = stringSet.iterator();
    while (stringIterator.hasNext()) {
      System.out.println(stringIterator.next());
    }
    System.out.println("====================================");

    //匿名内部类，定制排序，需要实现Comparator接口，并重写compare方法
    TreeSet<String> strSet = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
          return 1;
        } else if (o1.length() < o2.length()) {
          return -1;
        }
        return o1.compareTo(o2); //相等长度的字符串进行自然排序，如果只填写0，相同长度的字符串会只显示一个。
      }
    });
    strSet.add("dog");
    strSet.add("apple");
    strSet.add("cat");
    strSet.add("even");
    strSet.add("boy");
    strSet.forEach(element -> System.out.println(element));
    System.out.println("====================================");

    TreeSet<Student> students = new TreeSet<>();
    Student s1 = new Student(19, "jack");
    Student s2 = new Student(18, "pony");
    Student s3 = new Student(19, "hello");
    Student s4 = new Student(16, "mike");
    Student s5 = new Student(18, "james");
    Student s6 = new Student(26, "miya");
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    students.add(s6);
    students.forEach(element -> System.out.println(String.format("age:%d, name:%s", element.getAge(), element.getName())));
    System.out.println("====================================");

  }

  private static class Student implements Comparable<Student> {

    private int age;
    private String name;

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Student(int age, String name) {
      this.age = age;
      this.name = name;
    }

    @Override
    public int compareTo(Student o) {
      //自然排序，先按年龄大小排序，年龄相同时比较姓名
      if (this.age > o.getAge()) {
        return 1;
      } else if (this.age < o.getAge()) {
        return -1;
      } else {
        return this.getName().compareTo(o.getName());
      }
    }
  }
}
