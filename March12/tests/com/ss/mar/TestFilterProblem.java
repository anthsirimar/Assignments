package com.ss.mar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestFilterProblem {

	FilterProblem fp = new FilterProblem();
	
	List<String> words1 = Arrays.asList("ant","television","apple","abc", "mat");
	List<String> words2 = Arrays.asList("ant","mat");
	List<String> words3 = Arrays.asList("ant");
	List<String> words4 = Arrays.asList("television","apple","mat");
	
	@Test
	void testFilterProblemHP() {
		assertEquals(Arrays.asList("ant","abc"), fp.filterA(words1));
		assertEquals(Arrays.asList("ant"), fp.filterA(words2));
		assertEquals(Arrays.asList("ant"), fp.filterA(words3));
		assertEquals(Arrays.asList(), fp.filterA(words4));
	}

	@Test
	void testFilterProblemFP() {
		assertNotEquals(words1, fp.filterA(words1));
		assertNotEquals(Arrays.asList("mat"), fp.filterA(words2));
		assertNotEquals(Arrays.asList(), fp.filterA(words3));
		assertNotEquals(Arrays.asList(""), fp.filterA(words4));
	}
}
