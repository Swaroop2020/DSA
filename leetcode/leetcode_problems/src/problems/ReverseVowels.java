package problems;

//Reverse Vowels of a String

//Example 1:
//
//Input: s = "hello"
//Output: "holle"
//Example 2:
//
//Input: s = "leetcode"
//Output: "leotcede"

//Explanation
//https://algo.monster/liteproblems/345
public class ReverseVowels {

	 public String reverseVowels(String s) {
	        
	        boolean[] isVowels = new boolean[128];

	        for(char ch : "aeiouAEIOU".toCharArray()){
	            isVowels[ch] = true;
	        }

	        char[] characters =  s.toCharArray();
	        int i=0;
	        int j=characters.length-1;
	        while (i<j){
	            while(i<characters.length && !isVowels[characters[i]])
	            ++i;

	            while(j>=0 && !isVowels[characters[j]])
	            --j;

	            if(i<j){
	                char temp = characters[i];
	                characters[i]=characters[j];
	                characters[j]=temp;
	                ++i;
	                --j;
	            }
	        }

	        return String.valueOf(characters);
	    }

}
