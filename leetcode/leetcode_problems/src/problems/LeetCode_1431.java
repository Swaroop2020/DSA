package problems;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// Kids With the Greatest Number of Candies

//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true] 
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
public class LeetCode_1431 {
	
	public static void main(String[] args) {
		
		
		System.out.println(kidsWithCandies(new int[] {4,2,1,1,2},1));
		
	}

	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        
	        int max = 0;
	        Boolean[] array= new Boolean[candies.length];
	        for(int i=0; i<candies.length ; i++)
	            if(candies[i]>max)
	                max = candies[i];
	        
	        for(int i=0; i<candies.length; i++){
	            if(candies[i]+extraCandies>=max){
	                array[i] = true;
	                continue;
	            }
	            array[i] = false;    

	        }
	        return Arrays.asList(array);

	    }
}



