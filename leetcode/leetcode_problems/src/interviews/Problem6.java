package interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/*
	Group anagrams into a list of list 
o	Input = ["bat", "tab", "eat", "tea", "tan", "ate", "nat"]
o	Output = { [bat, tab] , [eat, tea, ate], [tan, nat] }

 * 
 */
public class Problem6 {
	public static void main(String[] args) {
		List<List<String>> anagrams = groupAnagrams(new String[]{"bat", "tab", "eat", "tea", "tan", "ate", "nat"});
		System.out.println(anagrams);
	}

	private static List<List<String>> groupAnagrams(String[] strings) {
		
		Map<String, List<String>> map = new HashMap<>();
		for(String str : strings) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			map.computeIfAbsent(new String(arr), k -> new ArrayList<>()).add(str);
		}
		
		return new ArrayList<>(map.values());
	}
}
