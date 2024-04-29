package com.demo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-27 16:11
 *
 * 身高从低到高，身高相同体重从轻到重，体重相同维持原来顺序
 **/
public class CompareHeightWeightTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = Integer.parseInt(sc.nextLine());
    String[] height = sc.nextLine().split(" ");
    String[] weight = sc.nextLine().split(" ");

    Set<Student> students = new TreeSet<>(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        if (o1.getHeight() != o2.getHeight()) {
          return o1.getHeight() - o2.getHeight();
        } else if (o1.getWeight() != o2.getWeight()) {
          return o1.getWeight() - o2.getWeight();
        } else {
          return o1.getIndex() - o2.getIndex();
        }
      }
    });

    for (int i = 0; i < count; i++) {
      students.add(new Student(i + 1, Integer.parseInt(height[i]), Integer.parseInt(weight[i])));
    }
    students.forEach(s -> System.out.print(s.getIndex()));
  }

  static class Student {

    private int height;
    private int weight;

    private int index;

    public Student(int index, int height, int weight) {
      this.index = index;
      this.height = height;
      this.weight = weight;
    }

    public int getIndex() {
      return index;
    }

    public void setIndex(int index) {
      this.index = index;
    }

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
    }

    public int getWeight() {
      return weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }
  }
}
