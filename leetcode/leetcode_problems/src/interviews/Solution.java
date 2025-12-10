package interviews;

//Asked in Synopsys interview

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given a integer which can be +ve or -ve 
//remove the given digit from number to maximize result

//Input: number = "1231", digit = "1"
//Output: "231"
//Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
//Since 231 > 123, we return "231".


class Solution {
    public static int findSolution(int N) {
        
    	int index = -1;
        String str = Integer.toString(N);
        int maxNumber = Integer.MIN_VALUE;
        if(str.charAt(0)=='-') {
        	for (int i = 1; i < str.length(); i++) { 
        		if(str.charAt(i)=='5') {
                String newNumberStr = str.substring(0, i) + str.substring(i + 1);
                int newNumber = Integer.parseInt(newNumberStr);

                if (newNumber > maxNumber) {
                    maxNumber = newNumber;
                }
        		}
            }

            return maxNumber;
        }
        for(int i=0;i<str.length();++i) {
        	char currentDigit = str.charAt(i);
        	if(currentDigit == '5') {
        		index = i;
        		if(i+1 < str.length()  && currentDigit < str.charAt(i+1)) {
        			break;
        		}
        	}
        }
        return Integer.parseInt(str.substring(0, index) + str.substring(index + 1));
    }
    
    public static void main(String[] args) {
		System.out.println(findSolution(-5859));
	}
}
//19587958
