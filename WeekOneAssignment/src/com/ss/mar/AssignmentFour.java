package com.ss.mar;

import java.util.ArrayList;
import java.util.List;

public class AssignmentFour {
	
	public List<String> noX(List<String> words){

		List<String> result = new ArrayList<String>();             
		
		words.forEach((w) -> {result.add(w.replaceAll("x", ""));});
		return result;
	}
}
