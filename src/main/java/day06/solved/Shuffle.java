package day06.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Shuffle {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("cse");
		list.add("cse");
		list.add("eee");
		Collections.shuffle(list);
		System.out.println(list);
	}
}