package problems;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(231321));
	//	System.out.println(7.0/10);
	}

	private static boolean isPalindrome(int i) {
		int result = 0;
		int temp = i;
		while(temp > 0) {
			int last = temp%10;
			result = result*10+last;
			temp = temp/10;
		}
		if(i == result)
		return true;
		return false;
		
		//boolean isPalindrome = IntStream.range(0,string.length()).noneMatch(i->newString.charAt(i) != newString.charAt(newString.length()-i-1));

	}
	
	private static boolean isPalind(int num) {
		String str = String.valueOf(num);
		int len = str.length();
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(len-1-i))
				return false;
		}
		return true;
	}

}
