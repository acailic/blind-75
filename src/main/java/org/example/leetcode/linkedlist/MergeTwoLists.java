package org.example.leetcode.linkedlist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fake =null;
        ListNode last = fake;
        while ( list1!=null && list2!=null){
            if(list1.val< list2.val){
                last.next = list1;
                last = list1;
                list1= list1.next;
            } else {
                last.next=list2;
                last = list2;
                list2 = list2.next;
            }

        }

        while(list1!=null){
            last.next=list1;
        }

        while (list2!=null){
            last.next=list2;
        }

        return fake.next;
    }
}
