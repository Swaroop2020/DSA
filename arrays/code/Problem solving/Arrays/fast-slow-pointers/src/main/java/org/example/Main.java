package org.example;

import org.example.model.ListNode;
import org.example.services.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static IsPalindromeLinkedList isPalLL = new IsPalindromeLinkedList();
    private final static DuplicateNumber dupNum = new DuplicateNumber();

    public static void main(String[] args) {

        MiddleOfTheLinkedList motll = new MiddleOfTheLinkedList();
        HappyNumber happyNumber = new HappyNumber();



        System.out.println("------------ LinkedList Cycle -------------");
        linkedListCycle();
        System.out.println("--------------------------------------------");

        System.out.println("------------ LinkedList Cycle II -------------");
        linkedListCycle2();
        System.out.println("--------------------------------------------");

        System.out.println("------------ Middle of The LinkedList -------------");
        System.out.println(motll.calculate(getLinkedList()));
        System.out.println("--------------------------------------------");

        System.out.println("------------ Happy Number -------------");
        System.out.println("82 is a Happy Number : "+happyNumber.calculate(82));
        System.out.println("61 is a Happy Number : "+happyNumber.calculate(61));
        System.out.println("--------------------------------------------");

        System.out.println("------------ Is Palindrome LinkedList -------------");
        isPalindrome();
        System.out.println("--------------------------------------------");

        System.out.println("-------------- Duplicate Number ----------------");
        int duplicate = dupNum.calculate(new int[]{2,6,4,1,5,3,5});
        System.out.println(duplicate);
        System.out.println("-----------------------------------------------");

        System.out.println("-------------- Reorder LinkedList ----------------");
        reorder();
        System.out.println("-----------------------------------------------");

    }

    private static void reorder() {

    }

    private static void isPalindrome() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        System.out.println("is palindrome : "+isPalLL.calculate(n1));


    }

    private static ListNode getLinkedList() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        return n1;
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