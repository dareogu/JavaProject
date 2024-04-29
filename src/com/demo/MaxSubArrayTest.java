package com.demo;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-28 10:56
 * <p>
 * 经典动态规划：最大子数组问题
 **/
public class MaxSubArrayTest {
  public static void main(String[] args) {
    int[] array = {1, -2, 3, 4, -7, 5, 3, -1, 3};
    System.out.println(getSumMaxSubArray(array));
  }

  private static int getSumMaxSubArray(int[] nums) {
    int len = nums.length;
    int[] dp = new int[len];
    dp[0] = nums[0];
    int max = dp[0];
    for (int i = 1; i < len; i++) {
      dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
      max = Math.max(max, dp[i]);
    }
    return max;
  }
}
