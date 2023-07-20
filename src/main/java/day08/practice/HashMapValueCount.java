package day08.practice;
import java.util.*;
public class HashMapValueCount {

	public static void main(String[] args) {
		
		Map<String, Integer> nameCountMap = new HashMap<>();
	

		String input = "Ram,Ram,Spider,spider,Superman,spider,hey,hello,hey";
		
		String[] names = input.split(",\\s*");

		

		for (String name : names) {
			nameCountMap.put(name.toLowerCase().trim(), nameCountMap.getOrDefault(name.toLowerCase().trim(), 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
			String name = entry.getKey();
			int count = entry.getValue();
			System.out.println(name + ": " + count);
		}
	}
}
