package com.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapStudentTest {
  public static void main(String[] args) {
    HashMap<Integer, Student> stud = new HashMap<>();
    stud.put(1, new Student("晓红", 18, 91.0f));
    stud.put(2, new Student("火火", 20, 58.0f));
    stud.put(3, new Student("红军", 19, 82.0f));
    stud.put(4, new Student("给力", 17, 100.0f));
    stud.put(5, new Student("水水", 25, 108.0f));
    stud.put(6, new Student("高虎", 13, 78.0f));

    System.out.println(stud.containsKey(6));

    Set<Map.Entry<Integer, Student>> studEntry = stud.entrySet();
    Iterator<Map.Entry<Integer, Student>> studIte = studEntry.iterator();
    while (studIte.hasNext()) {
      Map.Entry<Integer, Student> studNext = studIte.next();
      System.out.println(studNext.getKey() + "," + studNext.getValue().getName() + "," + studNext.getValue().getAge()
          + "," + Student.scoreCal(studNext.getValue().getScore()));
    }
  }

  protected static class Student {
    protected String name;
    protected int age;
    protected float score;

    public Student(String name, int age, float score) {
      this.name = name;
      this.age = age;
      this.score = score;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public float getScore() {
      return score;
    }

    public void setScore(float score) {
      this.score = score;
    }

    public static String scoreCal(float score) {
      if (score > (float) 100) {
        return "分数输入错误";
      } else if (score == (float) 100) {
        return "满分";
      } else if (score > (float) 90) {
        return "优秀";
      } else if (score > (float) 75) {
        return "良好";
      } else if (score >= (float) 60) {
        return "及格";
      } else {
        return "不及格";
      }
    }

  }
}
