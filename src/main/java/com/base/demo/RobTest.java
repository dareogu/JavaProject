package com.base.demo;

/**
 * @Auther Dareo Gu
 * @Create: 2023-01-31 13:42
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 原文链接：https://blog.csdn.net/qq_40707462/article/details/123264231
 **/
public class RobTest {

  public static void main(String[] args) {
    int[] money = {1, 2, 3, 1};
    int sum = rob(money);
    System.out.print("一共偷窃了： " + sum);
  }

  public static int rob(int[] nums) {
    int len = nums.length;
    if (len == 1) return nums[0];
    int a = nums[0];
    int b = Math.max(nums[0], nums[1]);
    for (int i = 2; i < len; i++) {
      int temp = b;
      b = Math.max(b, a + nums[i]);
      a = temp;
    }
    return b;
  }
}
