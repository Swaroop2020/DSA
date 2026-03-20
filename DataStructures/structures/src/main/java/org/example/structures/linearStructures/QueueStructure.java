package org.example.structures.linearStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueStructure {

    public static void main(String[] args) {

        /// ArrayBlockingQueue and LinkedBlockingQueue can be learnt later

        /// LinkedList implements both List and Deque interfaces
        Deque<Integer> que = new LinkedList<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        System.out.println(que);
        System.out.println(que.peek());

        /// recommended implementation
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);
        System.out.println(queue.poll());

        /// Thread safe
        /// slow
        /// High performance
        Queue<Integer> q = new ConcurrentLinkedDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
