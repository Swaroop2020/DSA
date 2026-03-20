package org.example.structures.linearStructures;

import com.sun.source.tree.SynchronizedTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StackStructure {

    public static void main(String[] args) {

        /// old way
        ///  this extends vector and vector is synchronized
        Stack<Integer> s = new Stack<>();
        s.push(1);

        /// as LinkedList implements Deque
        Deque<Integer> sack = new LinkedList<>();
        sack.push(10);
        sack.push(20);
        sack.push(30);
        System.out.println(sack);
        System.out.println(sack.peek());

        System.out.println("================================================");

        /// Modern way of creating a stack
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("================================================");

        /// Thread safety
        Deque<Integer> sta = new ConcurrentLinkedDeque<>();
        sta.push(10);
        sta.push(20);
        sta.push(30);
        System.out.println(sta);
        System.out.println(sta.peek());

    }

}
