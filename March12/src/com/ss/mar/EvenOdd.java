package com.ss.mar;

import java.util.List;

public class EvenOdd {
	
	public String buildString(List<Integer> intList) {
		StringBuilder result = new StringBuilder();
	
		intList.forEach(n -> result.append(evenOdd(n)+n.toString()+","));
		result.deleteCharAt(result.length()-1);
		return result.toString();
	}
	
	private String evenOdd(Integer n) {
		if(n % 2 == 0)
			return "e";
		else
			return "o";
	}
	
}
