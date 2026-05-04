package org.example.exercise;

public class SumOfFirstN {

    public int calculate(int n){
        if(n==0) return 0;
        int result = n + calculate(n-1);
        return result;
    }
}
