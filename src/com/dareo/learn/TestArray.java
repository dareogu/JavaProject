package com.dareo.learn;

public class TestArray {
  public static void main(String[] args) {
    String names[] = {"my", "world", "glb", "what", "are", "you", "doing"};
    // 动态赋值
    int[] shuzu1; // 声明数组变量
    shuzu1 = new int[5]; // 创建数组
    shuzu1[0] = 6; // 赋值
    shuzu1[1] = 16;
    shuzu1[2] = 61;
    shuzu1[3] = 60;
    shuzu1[4] = 3;

    // 静态赋值
    int shuzu2[] = {1, 2, 3, 44, 6, 0, 6, 9, 22, 12};
    for (int i = 0; i < shuzu2.length; i++) {
      System.out.println(shuzu2[i]);
    }

    // for循环遍历数组
    for (int t = 0; t < names.length; t++) {
      names[t] += "com/dareo";
      System.out.println(names[t]);
    }
    // foreach循环遍历数组
    for (String name : names) {
      System.out.println(name);
    }

    // 选择排序法
    int temp;
    for (int j = 0; j < shuzu1.length; j++) {
      for (int k = j + 1; k < shuzu1.length; k++) {
        if (shuzu1[j] > shuzu1[k]) {
          temp = shuzu1[j];
          shuzu1[j] = shuzu1[k];
          shuzu1[k] = temp;
        }
      }
      System.out.println(shuzu1[j]);
    }

  }
}