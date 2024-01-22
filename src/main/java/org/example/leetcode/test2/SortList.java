package org.example.leetcode.test2;

import org.example.leetcode.linkedlist.ListNode;

public class SortList {
    //  sort a linked list in ascending order

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        SortList sortList = new SortList();
        ListNode res = sortList.sortList(head);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    // Time complexity: O(nlogn)
    // Space complexity: O(logn)
    public ListNode sortList(ListNode head) {
        // fast slow pointer
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        pre.next = null;
        return merge(sortList(head), sortList(slow));
    }

    private ListNode merge(ListNode listNode, ListNode listNode1) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (listNode != null && listNode1 != null) {
            if (listNode.val < listNode1.val) {
                cur.next = listNode;
                listNode = listNode.next;
            } else {
                cur.next = listNode1;
                listNode1 = listNode1.next;
            }
            cur = cur.next;
        }

        if (listNode != null) {
            cur.next = listNode;
        } else {
            cur.next = listNode1;
        }

        return dummy.next;
    }

}
