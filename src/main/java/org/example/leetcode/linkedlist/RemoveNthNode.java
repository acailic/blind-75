package org.example.leetcode.linkedlist;

import java.util.List;

public class RemoveNthNode {
    // how this method works ?
    // 1 2 3 4 5 -> 1 2 3 5
    // so we need to find the node before the node to be removed
    // so we need to move the right pointer to n nodes
    // then move both pointers until right is null
    // then remove the node
    // return the head
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fake = new ListNode(0,head);
        ListNode left = fake;
        ListNode right = head;
        // move to right
        while(right!=null && n>0){
            n--;
            right=right.next;
        }
        // move to right and left
        while(right!=null){
            right = right.next;
            left = left.next;
        }
        // remove
        left.next=left.next.next;
        return fake.next;

    }

    // why is first moved only right and then both?
    // because we need to find the node before the node to be removed
    // so we need to move the right pointer to n nodes
    // then move both pointers until right is null
    // then remove the node
    // return the head


}
