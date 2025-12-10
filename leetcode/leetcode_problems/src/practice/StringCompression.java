package practice;

public class StringCompression {
	
	public static void main(String[] args) {
		char[] array = stringCompression(new char[] {'a','a','b','b','c','c','c'});
		System.out.println(array);
	}

	private static char[] stringCompression(char[] cs) {
		//a2b2c3
		StringBuilder sb = new StringBuilder();
		int count = 1;
		sb.append(cs[0]);
		for(int i=1;i<cs.length;i++) {
			char a = cs[i];
			if(cs[i-1] == a) {
			count++;
			}else {
				if(count>1) {
					sb.append(count);
				}
				sb.append(a);
				count= 1;
			}	
		}
		if(count>1) {
			sb.append(count);
		}
		return new String(sb).toCharArray();
	}

}
