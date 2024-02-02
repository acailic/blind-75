package org.example.leetcode.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
