package problems;

import java.util.HashMap;
import java.util.Map;

//Two Sum

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] array = {2,3,5,6,7,1,9,6,6};
		
		int target = 12;
		
		getSolution(array, target);	
		
	}

	private static void getSolution(int[] array, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<array.length; i++) {
			int complement  = target - array[i];
			if(map.containsKey(complement) && map.get(complement)!=i) {
				System.out.println("Pair : "+array[i]+ " : "+complement);
				System.out.println("Indeces : "+i+" : "+map.get(complement));
			}
			if(!map.containsKey(array[i])) {
				map.put(array[i], i);
			}
		}
	}

//	private static void getSolution(int[] array, int target) {
//		Map<Integer,Integer> map = new HashMap<>();
//		for(int i=0;i<array.length;i++) {
//			map.put(array[i],i);
//		}
//		for(int i=0;i<array.length/2;i++) {
//			int remainder = target-array[i];
//			if(map.containsKey(remainder)&&array[i]!=remainder) {
//				System.out.println(i+" "+map.get(remainder));
//			}
//		}
//	}
		

}
