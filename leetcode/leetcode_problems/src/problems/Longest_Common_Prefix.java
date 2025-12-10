package problems;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

//Longest Common Prefix

//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class Longest_Common_Prefix {
	
	public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        StringBuffer res = new StringBuffer("");
        for(int i=0;i<Math.min(first.length(), last.length());i++) {
        	if(first.charAt(i)==last.charAt(i)) {
        		res.append(first.charAt(i));
        	}else
        		break;
        }
        
        return res.toString();
    }
	public static void main(String args[]) {
		// Your code goes here
		Longest_Common_Prefix ob = new Longest_Common_Prefix();
		String s[] = {"flower", "flow", "flight"};
		System.out.println(ob.longestCommonPrefix(s));
	}

}
