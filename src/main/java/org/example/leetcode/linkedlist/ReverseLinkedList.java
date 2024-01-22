package org.example.leetcode.linkedlist;

import java.util.List;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // iterative
        ListNode current = head;
        ListNode prev= null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev= temp;
            current= temp;
        }
        return prev;


//        ListNode current = head;
//        ListNode prev = null;
//        while(current!=null){
//            ListNode next = current.next;
//            current.next = prev;
//            prev= current;
//            current =next;
//        }
//        return prev;

//        // T 0 n and M o 1
//        public ListNode reverseList(ListNode head) {
//            //recursive
//            if(head==null){
//                return null;
//            }
//            ListNode newhead=head;
//            if(head.next!=null){
//                newhead = reverseList(head.next);
//                head.next.next =head;
//            }
//            head.next=null;
//            return newhead;

            //iterative
            // ListNode current = head;
            // ListNode prev=null;
            // while(current!=null){
            //     ListNode next =current.next;
            //     current.next = prev;
            //     prev = current;
            //     current =next;
            // }
            // return prev;
    }
}
