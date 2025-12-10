package practice;

public class ReverseVowels {

	public static void main(String[] args) {
		String str = reverseVowel("abcefgihou");
		System.out.println(str);
	}

	private static String reverseVowel(String string) {
		boolean[] isVowels = new boolean[128];
		char[] array = string.toCharArray();
		for(char c : "aeiouAEIOU".toCharArray()) {
			isVowels[c] = true;
		}
		int i=0;
		int j = string.length()-1;
		System.out.println(j);
		while(i<j) {
			while(i<array.length && isVowels[array[i]]==false) {
				i++;
			}
			while(j>=0 && isVowels[array[j]]==false) {
				j--;
			}
			if(i<j) {
				char temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		return string.valueOf(array);
	}
}
