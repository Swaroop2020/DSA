package org.example.structures.maps;

import com.sun.source.tree.Tree;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/// Red -Black tree ensures that the height of the tree stays
/// h<= 2* log(n+1)
public class TreeMap2 {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        TreeSet<Integer> tree = new TreeSet<>(List.of(7,4,9, 2, 6, 8, 10, 1, 3, 5));
        System.out.println(tree);
    }
}
