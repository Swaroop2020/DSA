package practice;

public class ProductExceptSelf {

//	{3,2,1,4,5};
//	{2*1*4*5 , 1*4*5*3, 4*5*3*2, 3*2*1*4}
	
	public static void main(String[] args) {
		int[] array = product(new int[]{3,2,1,4,5});
		for(int s : array) {
			System.out.println(s+" ");
		}
	}

private static int[] product(int[] in) {
	int[] out = new int[in.length];
	int left = 1;
	int right = 1;
	for(int i=0;i<in.length;i++) {
		out[i] = left;
		left *= in[i];
	}
	for(int j=in.length-1;j>=0;j--) {
		out[j] *= right;
		right *= in[j];
	}
	
	return out;
	}
}
