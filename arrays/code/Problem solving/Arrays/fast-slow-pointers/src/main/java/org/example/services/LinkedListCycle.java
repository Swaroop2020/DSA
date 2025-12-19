package org.example.services;

import org.example.model.ListNode;

public class LinkedListCycle {

    public boolean calculate(ListNode head){
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        if(head == null || head.next == null){
            return false;
        }

        while(fastPtr != null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
}
