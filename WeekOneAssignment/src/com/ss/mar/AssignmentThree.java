package com.ss.mar;

import java.util.List;
import java.util.stream.Collectors;

public class AssignmentThree {
	
	public List<Integer> doubling(List<Integer> numbers){
		List<Integer> result = numbers.stream().map((n) -> {return n*2; }).collect(Collectors.toList());
		
		return result;
	}
}
