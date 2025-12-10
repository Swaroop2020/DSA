package interviews;

/*
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] array = {0,0,1,1,1,2,2,3,3,4};
		
		int size = removeDuplicates(array);
		for(int i=0;i<array.length;i++) {
			if(i>=size)
				array[i] = -1;
			System.out.print(array[i] + " ");
		}
	}

	private static int removeDuplicates(int[] array) {
		int i=0;
		
		for(int j=1;j<array.length;j++) {
			if(array[i]!=array[j]) {
				i++;
				array[i]=array[j];
			}
		}
		return i+1;
		
	}

}
