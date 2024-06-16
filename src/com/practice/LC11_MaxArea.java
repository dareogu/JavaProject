package com.practice;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-09 17:06
 **/
public class LC11_MaxArea {
  public static void main(String[] args) {
    int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println(getMaxArea(heights));
  }

  private static int getMaxArea(int[] height) {
    //Solution1:
//    int maxArea = 0;
//    for (int i = 0; i < height.length - 1; i++) {
//      for (int j = i + 1; j < height.length; j++) {
//        int minHeight = Math.min(height[i], height[j]);
//        maxArea = Math.max(maxArea, minHeight * (j - i));
//      }
//    }
//    return maxArea;
    //Solution2:
    int maxArea = 0;
    int l = 0;
    int r = height.length - 1;
    while (l < r) {
      maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }
    return maxArea;
  }
}
