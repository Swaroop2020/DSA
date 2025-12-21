package org.example.services;

import org.example.model.ListNode;

public class MiddleOfTheLinkedList {

    public ListNode calculate(ListNode head){

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
}
