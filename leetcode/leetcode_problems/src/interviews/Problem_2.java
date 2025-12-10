package interviews;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//animal
//
//a: 2
// 
//n: 1
// 
//i: 1
// 
//m: 1
// 
//l: 1
public class Problem_2 {
	
	public static void main(String[] args) {
		String str = "animal";
		Map<Character, Long> map = str.chars().mapToObj(c->Character.toLowerCase(Character.valueOf((char)c)))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
	}
	

}
