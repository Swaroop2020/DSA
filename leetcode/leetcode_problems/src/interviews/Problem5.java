package interviews;

 	/*
You have a series of numbers which are actually the price of a stock in a time series. Give the max potential loss
example:
 input : [250,210,220,250,325,300]
expected output : 40.

 	 */
public class Problem5 {
	
	public static void main(String[] args) {
		Integer[] array = {250,210,220,250,325,300};
		Integer maxLoss = getMaxLoss(array);
		System.out.println(maxLoss);
	}

	private static Integer getMaxLoss(Integer[] array) {
		int max = array[0];
		int loss = 0;
		for(int i=1;i<array.length;i++) {
			if(max>array[i]) {
				loss = Math.max(loss, max-array[i]);
			}else {
				max = array[i];
			}
		}
		return loss;
	}
	

}
