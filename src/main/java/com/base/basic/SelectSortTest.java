package com.base.basic;

public class SelectSortTest {
  public static void main(String[] args) {
    String names[] = {"my", "world", "glb", "what", "are", "you", "doing"};
    // 动态赋值
    int[] array; // 声明数组变量
    array = new int[5]; // 创建数组
    array[0] = 6; // 赋值
    array[1] = 16;
    array[2] = 61;
    array[3] = 60;
    array[4] = 3;

    // 静态赋值
    int array2[] = {1, 2, 3, 44, 6, 0, 6, 9, 22, 12};
    for (int i = 0; i < array2.length; i++) {
      System.out.println(array2[i]);
    }

    System.out.println("====================================");
    // for循环遍历数组
    for (int t = 0; t < names.length; t++) {
      names[t] += "com";
      System.out.println(names[t]);
    }
    System.out.println("====================================");

    // foreach循环遍历数组
    for (String name : names) {
      System.out.println(name);
    }
    System.out.println("====================================");

    // 选择排序法
    // 第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，
    // 然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零
    int temp;
    for (int j = 0; j < array.length; j++) {
      for (int k = j + 1; k < array.length; k++) {
        if (array[j] > array[k]) {
          temp = array[j];
          array[j] = array[k];
          array[k] = temp;
        }
      }
      System.out.println(array[j]);
    }

  }
}