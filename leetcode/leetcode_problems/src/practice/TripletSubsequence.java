package practice;

public class TripletSubsequence {
	
	public static void main(String[] args) {
		boolean b = findSequence(new int[] {29,20,24,29,22});
		System.out.println(b);
	}

	private static boolean findSequence(int[] is) {
		int min = Integer.MAX_VALUE;
		int med = Integer.MAX_VALUE;
		
		for(int a : is) {
			if(a>med) {
				return true;
			}
			
			if(a<=min) {
				min=a;
			}else {
				med = a;
			}
		}
		return false;
	}
}
