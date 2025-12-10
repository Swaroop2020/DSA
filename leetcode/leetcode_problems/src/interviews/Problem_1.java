package interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//int arr[]={1,5,3,2,7}
//
//sum = 6
//
//output ={0,1}
// 
//explanation :
//
//arr[0]+arr[1]=6
// 
//int[] findSum(int[] arr, int sum){
//
////code
//
//}

public class Problem_1 {
	
	public static void main(String[] args) {
		int arr[]={1,5,3,2,7};
		printIndexes(arr,6);
	}

	private static void printIndexes(int[] arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			
			map.put(arr[i],i );
		}
		
		System.out.println(map);
		
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(sum-arr[i])) {
				System.out.println(sum-arr[i]);
				System.out.println(i+" : "+map.get(sum-arr[i]));
				break;
			}
		}
	}
}
