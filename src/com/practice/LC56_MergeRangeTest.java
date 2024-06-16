package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 12:32
 * <p>
 * 题目描述：
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 * <p>
 * 示例 1：
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2：
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 **/
public class LC56_MergeRangeTest {

  public static int[][] merge(int[][] intervals) {
    int len = intervals.length;
    if (len < 2) {
      return intervals;
    }

    // 按照起点排序
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

    // 也可以使用 Stack，因为我们只关心结果集的最后一个区间
    List<int[]> res = new ArrayList<>();
    res.add(intervals[0]);

    for (int i = 1; i < len; i++) {
      int[] curInterval = intervals[i];

      // 每次新遍历到的列表与当前结果集中的最后一个区间的末尾端点进行比较
      int[] peek = res.get(res.size() - 1);

      if (curInterval[0] > peek[1]) {
        res.add(curInterval);
      } else {
        // 注意，这里应该取最大
        peek[1] = Math.max(curInterval[1], peek[1]);
      }
    }
    return res.toArray(new int[res.size()][]);
  }

  public static void main(String[] args) {
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    int[][] res = merge(intervals);
    for (int i = 0; i < res.length; i++) {
      System.out.println(Arrays.toString(res[i]));
    }
  }
}
