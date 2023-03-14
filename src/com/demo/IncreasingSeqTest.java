package com.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther Dareo Gu
 * @Create: 2023-02-22 10:12
 * 获取最大长度的递增数列
 **/
public class IncreasingSeqTest {
  public static void main(String[] args) {
    int[] ints = {1, 5, 2, 4, 3, 4};
    Set<Integer> lens = new HashSet<>();
    for (int i = 0; i < ints.length; i++) {
      lens.add(longest(ints, i));
    }
    int max = lens.stream().max(Integer::compareTo).get();
    System.out.print(max);
  }

  private static int longest(int[] a, int index) {
    int maxLength = 1;
    for (int j = index + 1; j < a.length; j++) {
      if (a[j] > a[index]) {
        maxLength = Math.max(maxLength, longest(a, j) + 1);
      }
    }
    return maxLength;
  }

}
