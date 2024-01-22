package org.example.leetcode.test;

import org.example.leetcode.linkedlist.ListNode;
//1 7 4
//
//        5 8 9
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode l1 = new ListNode(1, new ListNode(7, new ListNode(4)));
//        while (l1 != null) {
//            System.out.print(l1.val + " ");
//            l1 = l1.next;
//        }
        ListNode l2 = new ListNode(5, new ListNode(8, new ListNode(9)));
        System.out.println("  \n");
//        while (l2 != null) {
//            System.out.print(l2.val + " ");
//            l2 = l2.next;
//        }
        // Call the method to merge the lists
        ListNode result = mergeTwoLists(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Method implementation goes here

        // it expexts list are sorted
        ListNode current = new ListNode(-1);
        ListNode head =current;
        while(l1!=null && l2.next !=null){
            if(l1.val> l2.val){
                current.next=l2;
                l2 = l2.next;
            } else {
                current.next=l1;
                l1 = l1.next;
            }

            current= current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return head.next;
    }


}
