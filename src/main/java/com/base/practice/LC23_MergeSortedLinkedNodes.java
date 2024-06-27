package com.base.practice;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-06 12:
 *
 * 题目：
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 * 示例 1：
 *
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 * 示例 2：
 *
 * 输入：lists = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：lists = [[]]
 * 输出：[]
 *
 * */
public class LC23_MergeSortedLinkedNodes {
  static class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
      this.val = val;
    }
  }

  public static Node buildNodeChan(int... values) {
    if (values == null || values.length == 0) {
      return new Node();
    } else {
      Node node = new Node(values[0]);
      Node temp = node;
      for (int i = 1; i < values.length; i++) {
        temp.next = new Node(values[i]);
        temp = node.next;
      }
      return node;
    }
  }

  public static void main(String[] args) {
    Node a = buildNodeChan(1, 4, 5);
    Node b = buildNodeChan(1, 3, 4);
    Node c = buildNodeChan(2, 6);
    Node[] nodes = {a, b, c};
    Node result = mergeNodeList(nodes);
    while (result != null) {
      System.out.print(result.val + "  ");
      result = result.next;
    }

  }

  public static Node mergeNodeList(Node... nodes) {
    Node result = null;
    for (Node node : nodes) {
      result = mergeTwoNodes(result, node);
    }
    return result;
  }

  public static Node mergeTwoNodes(Node a, Node b) {
    if (a == null || b == null) {
      return a != null ? a : b;
    }

    if (a.val < b.val) {
      a.next = mergeTwoNodes(a.next, b);
      return a;
    } else {
      b.next = mergeTwoNodes(b.next, a);
      return b;
    }
  }
}
