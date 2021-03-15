package com.ss.mar;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterProblem {
	
	public List<String> filterA(List<String> words){		
		Stream<String> wordsStream = words.stream();
		
		wordsStream = wordsStream.filter(w -> (w.length() == 3 && w.startsWith("a")));
		
		return wordsStream.collect(Collectors.toList());
	}
}
