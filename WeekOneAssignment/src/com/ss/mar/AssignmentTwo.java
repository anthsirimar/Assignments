package com.ss.mar;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {

	public List<Integer> rightDigit(List<Integer> numbers){
		List<Integer> result = new ArrayList<Integer>(); 
		
		numbers.forEach((n) -> {result.add(n%10);});
		
		return result;
	}
}
