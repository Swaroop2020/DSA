package practice;

public class MergeStringsAlternately {
	
	public static void main(String[] args) {
		String str = mergeStrings("abcd","efg");
		System.out.println(str);
		
	}

	private static String mergeStrings(String str1, String str2) {
		StringBuilder str = new StringBuilder();
		int min = Math.min(str1.length(), str2.length());
		for(int i=0;i<min;i++) {
			str.append(str1.charAt(i)).append(str2.charAt(i));
		}
		str = str.append(str1.substring(min)).append(str2.substring(min));
		return str.toString();
		
	}

}
