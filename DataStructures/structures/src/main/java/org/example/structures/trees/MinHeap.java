package org.example.structures.trees;

import java.util.PriorityQueue;

/// A PriorityQueue in java is by default a MinHeap
public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> minimumHeap = new PriorityQueue<>();

        minimumHeap.offer(20);
        minimumHeap.offer(10);
        minimumHeap.offer(40);
        minimumHeap.offer(30);

        System.out.println(minimumHeap.peek());
        System.out.println(minimumHeap.poll());
        System.out.println(minimumHeap);


    }
}
