package com.practice;

import java.util.Scanner;

/**
 * @Auther Dareo Gu
 * @Create: 2023-03-14 17:16
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
 * 正常返回倒数第k个结点指针，异常返回空指针.
 * 要求：
 * (1)正序构建链表;
 * (2)构建后要忘记链表长度。
 * 数据范围：链表长度满足 1≤n≤1000
 * 且 k≤n，链表中数据满足 0≤val≤10000
 * <p>
 * 输入描述：
 * 输入说明
 * 1 输入链表结点个数
 * 2 输入链表的值
 * 3 输入k的值
 * <p>
 * 输出描述：
 * 输出一个整数
 * <p>
 * 示例
 * 输入：
 * 8
 * 1 2 3 4 5 6 7 8
 * 4
 * <p>
 * 输出：
 * 5
 **/
public class HJ51_S_GetValueFromLinkedListTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int n = Integer.parseInt(sc.next());
      ListNode head = new ListNode(-1);
      ListNode temp = head;
      //生成链表
      for (int i = 0; i < n; i++) {
        ListNode node = new ListNode(sc.nextInt());
        temp.next = node;
        temp = temp.next;
      }
      int k = Integer.parseInt(sc.next());
      if (getKthFromEnd(head.next, k) != null) {
        System.out.println(getKthFromEnd(head.next, k).val);
      } else {
        System.out.println(0);
      }

    }
  }

  public static ListNode getKthFromEnd(ListNode head, int k) {
    int n = 0;
    ListNode node = null;
    //记录有多少节点
    for (node = head; node != null; node = node.next) {
      n++;
    }
    //找倒数第k个
    for (node = head; n > k; n--) {
      node = node.next;
    }

    return node;
  }

  static class ListNode {
    ListNode next;
    int val;

    ListNode(int val) {
      this.val = val;
      next = null;
    }
  }

}


