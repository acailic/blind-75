package org.example.leetcode.linkedlist;

import java.util.List;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy= new ListNode(0);
        ListNode current = head;
        while(current!=null){
            ListNode prev = dummy;
            while(prev.next!=null && prev.next.val < current.val){
                prev=prev.next;
            }
            // insert cur beetween prev and next
            ListNode temp = current.next;
            current.next= prev.next;
            prev.next=current;
            current =temp;

        }
        return  dummy.next;
    }
}
