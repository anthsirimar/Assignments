package com.ss.mar;

import java.util.List;
import java.util.stream.Collectors;

public class AssignmentFour {
	
	public List<String> noX(List<String> words){

		List<String> result = words.stream().map((w) -> {return w.replaceAll("x", ""); })
								.collect(Collectors.toList());

		return result;
	}
}
