package day06.solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testFrequency {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(args);
		int cnt = Collections.frequency(list, "cse");
		System.out.println(cnt);
	}
}
