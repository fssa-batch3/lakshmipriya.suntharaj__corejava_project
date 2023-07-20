package day09.practice;
import java.util.*;
public class SortPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(8);
		num.add(9);
		num.add(45);
		num.add(12);
		num.add(1);
		
		
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
	}
	
}
