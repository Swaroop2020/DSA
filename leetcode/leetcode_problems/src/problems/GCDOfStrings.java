package problems;

//1071. Greatest Common Divisor of Strings

//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"

public class GCDOfStrings {
	
    public static String gcdOfStrings(String str1, String str2) {
//        if(str1.length()<str2.length())
//        return gcdOfStrings(str2,str1);
//        if(str1.equals(str2)){
//            return str2;
//        }
//        if(str1.startsWith(str2)){
//           return gcdOfStrings(str1.substring(str2.length()),str2);
//        }
//        return "";
    	
    	if(str1.length()<str2.length()) {
    		return gcdOfStrings(str2,str1);
    	}
    	if(str1.equals(str2)) {
    		return str1;
    	}
    	if(str1.startsWith(str2)) {
    		return gcdOfStrings(str1.substring(str2.length()),str2);
    	}
    	return "";
    }

    public static void main(String[] args) {
    	System.out.println(gcdOfStrings("ABC","ABCABCABC"));
	}
}




