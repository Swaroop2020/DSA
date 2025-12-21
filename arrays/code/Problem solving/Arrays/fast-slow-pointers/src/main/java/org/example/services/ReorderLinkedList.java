package org.example.services;

import org.example.model.ListNode;

///  LeetCode 143
public class ReorderLinkedList {

    public void calculate(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split & reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null; // cut the list

        ListNode first = head;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second= temp2;

        }
    }


    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
