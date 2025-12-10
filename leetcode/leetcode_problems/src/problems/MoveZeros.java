  package problems;

//https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

//283. Move Zeroes

/*
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]
*/

public class MoveZeros {
	public static void main(String[] args) {
		int[] array = moved(new int[] {0,1,0,3,12,14});
		for(int a: array) {
			System.out.print(a+" ");
		}
	}
//	private static int[] move(int[] in) {
//		int start = 0;
//		for(int i=0;i<in.length;i++) {
//			if(in[i]!=0) {
//				int temp = in[i];
//				in[i] = in[start];
//				in[start] = temp;
//				start++;
//			}
//		}
//		return in;
//	}
	
	private static int[] moved(int[] input) {
		int left = 0;
		int right = 0;
		while(right<input.length) {
			if(input[right]!=0) {
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
			}
			right++;
		}
		return input;
	}
}
