package org.example.leetcode.test2;

import org.example.leetcode.linkedlist.ListNode;

public class InsertationSort {

//    Given the head of a singly linked list,
//    sort the list using insertion sort, and return the sorted list's head.
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr=head;
        while(curr!=null){
            // new one
            ListNode prev = dummy;
            /// sort
            while(prev.next!=null && prev.next.val<curr.val){
                prev= prev.next;
            }
            /// insert cur, prev->curr
            ListNode temp = curr.next;
            curr.next= prev.next; //insert at current pos
            prev.next=curr;
            curr = temp;
        }
        return dummy.next;
    }
}
