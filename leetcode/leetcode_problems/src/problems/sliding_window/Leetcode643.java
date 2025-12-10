package problems.sliding_window;

//
public class Leetcode643 {
	
    public static double findMaxAverage(int[] nums, int k) {
    	
    	double sum = 0;
    	for(int i=0;i<k;i++) {
    		sum+= nums[i];
    	}
    	double maxSum = sum;
    	
    	int start = 0;
    	int end = k;
    	while(end<nums.length) {
    		sum-=nums[start];
    		start++;
    		
    		sum+=nums[end];
    		end++;
    		
    		maxSum = Math.max(maxSum, sum);
    	}
    	
    	return maxSum/4;
    	
    }
    
    public static void main(String[] args) {
		double max = findMaxAverage(new int[] {1,12,-5,-6,50,3},4);
		System.out.println(max);
	}

}
