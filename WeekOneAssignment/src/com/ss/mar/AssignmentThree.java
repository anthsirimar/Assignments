package com.ss.mar;

import java.util.ArrayList;
import java.util.List;

public class AssignmentThree {
	
	public List<Integer> doubling(List<Integer> numbers){
		List<Integer> result = new ArrayList<Integer>(); 
		
		numbers.forEach((n) -> {result.add(n*2);});
		
		return result;
	}
}
