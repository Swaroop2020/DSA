package org.example.structures.trees;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {

    public static void main(String[] args) {

        // In Java, a PriorityQueue is a min heap by default.
        // Java builds a binary min heap internally.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(10);
        minHeap.offer(40);
        minHeap.offer(20);
        minHeap.offer(30);
        minHeap.offer(50);

        System.out.println(minHeap);

        // In a tree
        // parent = (i-1)/2
        //left child = (2*i)+1
        //right child = (2*i)+2

        // By Default a priorityQueue is a binary min heap but we can flip it.
        // using a comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(20);
        maxHeap.offer(10);
        maxHeap.offer(40);
        maxHeap.offer(30);
        maxHeap.offer(50);

        System.out.println(maxHeap);

    }
}
