package org.example.structures;

import java.util.Arrays;

public class FenwickTree {

    private int n;
    private int[] tree;

    public FenwickTree(int size){
        this.n = size;
        this.tree = new int[n+1];
    }

    public FenwickTree(int[] array){
        this(array.length);
        for(int i=0;i<array.length;i++){
            tree[i+1] = array[i];
        }
        for(int i=1;i<=n;i++){
            int nextParent = i+ lsb(i);
            if(nextParent<=n){
                tree[nextParent] += tree[i];
            }
        }
    }

    public void update(int i,int delta){
        while(i<=n){
            tree[i] += delta;
            i+=lsb(i); // to the next parent
        }
    }

    private int lsb(int i){
        return i&-i;
    }

    public int prefixSum(int i){
        int sum=0;
        while(i>0){
            sum+=tree[i];
            i-=lsb(i); // to the parent
        }
        return sum;
    }

    public int rangeSum(int l,int r){
        return prefixSum(r) - prefixSum(l-1);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}
