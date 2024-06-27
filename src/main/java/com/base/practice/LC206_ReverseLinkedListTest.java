package com.base.practice;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-16 12:39
 * <p>
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * <p>
 * 示例1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 **/
public class LC206_ReverseLinkedListTest {

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode nextTemp = curr.next; // 保存下一个节点的引用
      curr.next = prev; // 将当前节点指向它的前一个节点
      prev = curr; // prev向后移动一个节点
      curr = nextTemp; // curr向后移动一个节点
    }
    return prev; // 返回prev，此时为翻转后链表的头节点
  }

  public static void main(String[] args) {
    // 示例：创建一个链表 1->2->3->4->5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode reversedHead = reverseList(head);

    // 输出翻转后的链表 5->4->3->2->1
    while (reversedHead != null) {
      System.out.print(reversedHead.val + " ");
      reversedHead = reversedHead.next;
    }
  }
}
