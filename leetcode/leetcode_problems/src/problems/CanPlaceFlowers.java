package problems;

//605. Can Place Flowers

//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false


//solution explaination  at https://algo.monster/liteproblems/605
public class CanPlaceFlowers {
	
	public static void main(String[] args) {
		boolean val = canPlaceFlowers(new int[]{1,0,0,0,0,0,0},3);
		System.out.println(val);
		
	}

	private static boolean canPlaceFlowers(int[] is, int n) {
		
//		for(int i=0;i<is.length;i++) {
//			int left = i==0 ? 0 : is[i-1];
//			int right = i==is.length-1 ? 0 : is[i+1];
//			if(left+is[i]+right==0) {
//				n--;
//				is[i]=1;
//			}
//		}
		
		for(int i=0;i<is.length;i++) {
			int left = i==0 ? 0 : is[i-1];
			int right = i==is.length-1 ? 0:is[i+1];
			if(left+right+is[i]==0) {
				is[i] = 1;
				n--;
			}
		}
		return n<=0;
		// TODO Auto-generated method stub
		
	}
}
