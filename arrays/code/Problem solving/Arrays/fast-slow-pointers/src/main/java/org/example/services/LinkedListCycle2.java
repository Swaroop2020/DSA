package org.example.services;

import org.example.model.ListNode;

public class LinkedListCycle2 {

    public ListNode calculate(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                while (head!=slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

}
