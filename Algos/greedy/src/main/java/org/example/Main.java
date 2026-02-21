package org.example;

import org.example.service.PartitionLabels;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PartitionLabels partitionLabels = new PartitionLabels();

        System.out.println(partitionLabels.calculate("ababcbacadefegdehijhklij"));
    }
}