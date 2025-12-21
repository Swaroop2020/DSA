package org.example.services;

import java.util.HashSet;

public class HappyNumber {

    public boolean calculate(int n){

        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int sum = 0;
            while(n!=0){
                int dig = n%10;
                sum += dig*dig;
                n/=10;
            }

            if(!set.add(sum)) return false;

            n= sum;
        }
        return true;

    }
}
