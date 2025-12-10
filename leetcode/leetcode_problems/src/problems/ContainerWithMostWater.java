package problems;

//https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75

//11. Container With Most Water

/*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1

*/
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int vol = getMaxVol(new int[] {1,8,6,2,5,4,8,3,7});
		System.out.println(vol);
	}

	private static int getMaxVol(int[] in) {
//		int i=0;
//		int j=in.length-1;
//		int max = Integer.MIN_VALUE;
//		while(i<j) {
//			int vol = Math.min(in[i],in[j])*(j-i);
//			max = vol>max ? vol:max;
//			if(in[i]>in[j]) {
//				j--;
//			}else {
//				i++;
//			}
//		}
//		return max;
		int i =0;
		int j = in.length-1;
		int max = Integer.MIN_VALUE;
		while(i<j) {
			int vol = Math.min(in[i], in[j])*(j-i);
			max = vol>max ? vol:max;
			if(in[i]>in[j]) {
				j--;
			}else {
				i++;
			}
		}
		return max;
	}
}
