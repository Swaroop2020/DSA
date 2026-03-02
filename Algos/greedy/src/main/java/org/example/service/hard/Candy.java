package org.example.service.hard;

/// Leetcode : 135
public class Candy {

    public int candy(int[] ratings) {
        int length = ratings.length;
        if(length==0) return 0;

        int[] candies = new int[length];
        for(int i=0;i<length;i++){
            candies[i] = 1;
        }

        //left to right pass
        for(int i=1;i<length;i++){
            if(ratings[i]> ratings[i-1])
                candies[i] = candies[i-1]+1;
        }

        // right to left
        for(int i=length-2; i>=0; i--){
            if(ratings[i]>ratings[i+1])
                candies[i] = Math.max(candies[i+1]+1, candies[i]);
        }
        int count =0;
        for(int i: candies){
            count+=i;
        }
        return count;
    }
}
