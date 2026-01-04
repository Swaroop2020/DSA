package org.example.service.medium;

/// Leeetcode 340
public class LongestSubStringWithAtmostKDistinct {

    public int calculate(String str, int k){

        if(str==null || k==0) return 0;

        int left =0;
        int[] freq = new int[256];
        int distinct = 0;
        int max = 0;
        for(int right=0;right<str.length();right++){
            int rdx = str.charAt(right);
            if(++freq[rdx]==1) distinct++;

            while(distinct>k){
                int ldx = str.charAt(left);
                if(--freq[ldx]==0) distinct--;
                left++;
            }

            max = Math.max(max, right-left+1);

        }
        return max;
    }
}
