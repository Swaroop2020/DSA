package practice;

public class KidsWithGreatestCandies {
	public static void main(String[] args) {
		boolean[] array = getKidsArray(new int[]{1,2,3,4,5,6},3);
		for(boolean t : array) {
			System.out.print(t+" ");
		}
	}
	

	private static boolean[] getKidsArray(int[] in, int i) {
		boolean[] array = new boolean[in.length];
		int max = Integer.MIN_VALUE;
		for(int a:in) {
			if(a>max) {
				max=a;
			}
		}
		
		for(int k=0;k<in.length;k++) {
			if(in[k]+i>=max) {
				array[k] = true;
			}
		}
		return array;
	}

}
