package org.example.leetcode.linkedlist;

public class DetectACycle {
    // fast and slow pointer
    public boolean hasCycle(ListNode head) {
        // fast and slow
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }
}
