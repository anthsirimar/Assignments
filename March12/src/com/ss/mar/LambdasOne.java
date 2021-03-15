package com.ss.mar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class LambdasOne {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("table", "couch", "elevator", "television", "chair", "mat");

		System.out.println("Shortest to longest");
		Collections.sort(words, (w1, w2) -> (w1.length() - w2.length()));
		words.forEach((w) -> {
			System.out.println(w);
		});

		System.out.println("");
		System.out.println("Longest to shortest");
		Collections.sort(words, (w1, w2) -> (w2.length() - w1.length()));
		words.forEach(System.out::println);

		System.out.println("");
		System.out.println("Alphabetically");
		Collections.sort(words, (w1, w2) -> (w1.charAt(0) - w2.charAt(0)));
		words.forEach(System.out::println);

		System.out.println("");
		System.out.println("Words that contain 'e'");
		Collections.sort(words, (w1,w2) -> {
			if (w1.contains("e"))
				return -1;
			else if(w2.contains("e"))
				return 1;
			else
				return 0;
		});
		words.forEach(System.out::println);
		

		System.out.println("");
		Collections.sort(words, (w1, w2) -> (w2.length() - w1.length()));
		System.out.println("Words that contain 'e' using my static method");
		Collections.sort(words,(w1,w2) -> LambdasOne.sortE(w1, w2));
		words.forEach(System.out::println);
		
	}
	
	public static int sortE(String s1, String s2) {
		if (s1.contains("e"))
			return -1;
		else if(s2.contains("e"))
			return 1;
		else
			return 0;
	}

}
