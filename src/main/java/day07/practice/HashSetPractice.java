package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		System.out.println("Using ArrayList :" + numbers);

		HashSet<Integer> numberset = new HashSet<>();
		numberset.add(1);
		numberset.add(2);
		numberset.add(3);
		numberset.add(2);
		System.out.println("Using Set :" + numberset);
		
	}

}
