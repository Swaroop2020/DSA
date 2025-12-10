package problems;

//Product of Array Except Self
/*
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

//Explaination at https://algo.monster/liteproblems/238
public class ProductExceptSelf {
	
	public static void main(String[] args) {
		int[] arr = productExceptSelf(new int[] {1,2,3,4});
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

	private static int[] productExceptSelf(int[] input) {
		int[] result = new int[input.length];
		int leftProduct = 1;
		for(int i=0; i< input.length;i++) {
			result[i] = leftProduct;
			leftProduct*=input[i];
		}
		
		int rightProduct = 1;
		for(int j=input.length-1;j>=0;j--) {
			result[j] = rightProduct*result[j];
			rightProduct = rightProduct*input[j];
		}
		
		
		return result;
	}

//	private static int[] productExceptSelf(int[] is) {
//		int[] res = new int[is.length];
//		
//		int leftProduct = 1;
//		int rightProduct = 1;
//		for(int i=0;i<is.length;i++) {
//			res[i] = leftProduct;
//			leftProduct *= is[i];
//		}
//		
//		for(int j=is.length-1;j>=0;j--) {
//			res[j] *= rightProduct;
//			rightProduct *= is[j];
//		}
//		return res;
//	}
	
	

}
