package org.example.structures;

import java.util.Arrays;

public class FenwickTree2 {

    private int n;
    public int[] tree;

    public FenwickTree2(int n){
        this.n=n;
        this.tree = new int[n+1];
    }

    public FenwickTree2(int[] array){
        this(array.length);
        for(int i=0;i<array.length;i++){
            tree[i+1] = array[i];
        }
        for(int i=0;i< array.length;i++){
            int next = i+lsb(i);
            if(next<=n){
                tree[next]+=tree[i];
            }
        }
    }

    public void update(int i, int delta){
        while(i<=n){
            tree[i] += delta;
            i+=lsb(i);
        }
    }

    public int lsb(int i){
        return i&-i;
    }

    public int prefixSum(int i){
        int sum =0;
        while(i>0){
            sum+=tree[i];
            i-=lsb(i);
        }
        return sum;
    }

    public int rangeSum(int l, int r){
        return prefixSum(r) - prefixSum(l-1);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}
