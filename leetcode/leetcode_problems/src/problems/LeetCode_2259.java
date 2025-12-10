package problems;

//Remove Digit From Number to Maximize Result

//Input: number = "1231", digit = "1"
//Output: "231"
//Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
//Since 231 > 123, we return "231".

public class LeetCode_2259 {
	
    public static String removeDigit(String number, char digit) {
        int i =0;
        int index = 0;
         for(i =0;i<number.length();i++){
            if(number.charAt(i)==digit){
                index=i;
                if(i+1<number.length() && number.charAt(i)<number.charAt(i+1)){
                    break;
                }
            }
         }
         return number.substring(0,index)+number.substring(index+1);
    }
    
    public static void main(String[] args) {
		System.out.println(removeDigit("1232321",'3'));
	}

}
