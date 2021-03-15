package com.ss.mar;

import java.util.List;
import java.util.stream.Collectors;

public class AssignmentTwo {

	public List<Integer> rightDigit(List<Integer> numbers){
		List<Integer> result = numbers.stream().map((n) -> {return n%10; }).collect(Collectors.toList());
		
		return result;
	}
}
