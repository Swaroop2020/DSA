package interviews;

public class Problem_4 {
	
	public static void main(String[] args) {
		
		String input = "Welcome to valuelabs";
		String[] arr = input.split(" ");
		
		String rev = "";
		for(int i=0; i<arr.length;i++) {
			String word = arr[i];
			String drow = "";
			for(int j=word.length()-1; j>=0;j--) {
				drow = drow+word.charAt(j);
			}
			rev = rev+drow+" ";
		}
		System.out.println("rev :"+rev);
		
		StringBuilder str = new StringBuilder().reverse();
		for(int i=input.length()-1; i>=0 ; i--) {
			str.append(input.charAt(i));
		}
		System.out.println(str.toString());
	
	}

}
