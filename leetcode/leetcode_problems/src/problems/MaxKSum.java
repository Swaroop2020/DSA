package problems;

import java.util.Arrays;
//https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75

//1679. Max Number of K-Sum Pairs
/*
Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

*/
public class MaxKSum {

	public static void main(String[] args) {
		int pairs = getPairs(new int[]{3,1,3,4,3},6);
		System.out.println(pairs);
	}

	private static int getPairs(int[] in, int k) {
		Arrays.sort(in);
		int i=0;
		int j=in.length-1;
		int count = 0;
		while(i<j) {
			int sum = in[i]+in[j];
			if(sum ==k ) {
				count++;
				i++;
				j--;
			}else if(sum<k) {
				i++;
			}else {
				j--;
			}
		}
		return count;
	}
}
