package com.base.basic;

import java.util.Arrays;

public class ArrayCopyTest {
  public static void main(String[] args) {
    int array1[] = {1, 4, 51, 6, 30, 44, 2, 21, 56};
    int array2[] = {20, 3, 21, 5, 8, 7, 19};

    //��source����λ��0��ʼ��3�����ֿ�����dest����Ϊ2��λ����
    System.arraycopy(array1, 0, array2, 2, 3);
    for (int element : array2) {
      System.out.println(element + ",");
    }
    System.out.println(Arrays.toString(array2));

    int[] array3 = Arrays.copyOf(array1, 6); //����һ��copy����ķ���
    System.out.println(Arrays.toString(array3));
  }
}
