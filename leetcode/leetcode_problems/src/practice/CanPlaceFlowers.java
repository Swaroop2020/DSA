package practice;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		boolean b = canPlaceFlowers(new int[]{1,0,0,0,0,1,0,0},2);
		System.out.println(b);
	}

	private static boolean canPlaceFlowers(int[] in, int n) {
		if(n==0) {
			return true;
		}
		for(int i=0;i<in.length;i++) {
			int left = i==0 ? 0:in[i-1];
			int right = i==in.length-1 ? 0:in[i+1];
			if(left+in[i]+right == 0) {
				in[i]=1;
				n--;
				if(n==0) {
					return true;
				}
			}
		}
		return false;
	}
}
