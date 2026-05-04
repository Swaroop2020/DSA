package org.example.exercise;

public class First {

    ///  to print - 1 2 3 4 5
    public void print(int n){
        if(n==0) return;

        print(n-1);
        System.out.print(n+" ");
    }

    public void printReverse(int n){
        if(n==0) return;

        System.out.print(n+" ");
        printReverse(n-1);
    }
}
