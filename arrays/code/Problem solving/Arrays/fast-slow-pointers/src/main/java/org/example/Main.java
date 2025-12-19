package org.example;

import org.example.model.ListNode;
import org.example.services.LinkedListCycle;
import org.example.services.LinkedListCycle2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("------------ LinkedList Cycle -------------");
        linkedListCycle();
        System.out.println("--------------------------------------------");

        System.out.println("------------ LinkedList Cycle II -------------");
        linkedListCycle2();
        System.out.println("--------------------------------------------");

    }

    private static void linkedListCycle() {

        LinkedListCycle llc = new LinkedListCycle();
        // ---------- Sample Input 1: Cycle exists ----------
        // 1 -> 2 -> 3 -> 4 -> 2

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        if(llc.calculate(n1)){
            System.out.println(" This Linked List has a cycle ");
        }else {
            System.out.println(" This Linked List has a cycle ");
        }

        // ---------- Sample Input 2: No cycle ----------
        // 1 -> 2 -> 3 -> 4 -> null

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        if(llc.calculate(a1)){
            System.out.println(" Yes, This Linked List has a cycle ");
        }else {
            System.out.println(" No, This Linked List doesn't have a cycle ");
        }
    }

    private static void linkedListCycle2() {

        LinkedListCycle2 llc2 = new LinkedListCycle2();
        // ---------- Sample Input 1: Cycle exists ----------
        // 1 -> 2 -> 3 -> 4 -> 2

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        System.out.println(llc2.calculate(n1));
        // ---------- Sample Input 2: No cycle ----------
        // 1 -> 2 -> 3 -> 4 -> null

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        System.out.println(llc2.calculate(a1));
    }
}