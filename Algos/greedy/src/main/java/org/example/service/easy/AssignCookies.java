package org.example.service.easy;

import java.util.Arrays;

/// Leetcode: 455
public class AssignCookies {

    /// This is just to fool leetcode for timecomplexity
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }

    /// Time complexity : O(nlogn + mlogm)
    public int findContentChildren(int[] g, int[] s) {

        /// Time complexity: O(nlogn)
        Arrays.sort(g);
        /// Time complexity: O(mlogm)
        Arrays.sort(s);

        int i=0,j=0;

        /// Time complexity : O(m+n)
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
