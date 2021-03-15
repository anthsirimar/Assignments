package com.ss.mar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestAssignmentFour {

	AssignmentFour a = new AssignmentFour();
	
	List<String> list1 = Arrays.asList("xxax","aa","cbxdhxx", "x","nnxxwxxn");
	List<String> list2 = Arrays.asList("a", "bb");
	List<String> list3 = Arrays.asList("x");
	List<String> list4 = Arrays.asList();
	
	@Test
	void testNoXHP() {
		assertEquals(Arrays.asList("a","aa","cbdh","","nnwn"), a.noX(list1));
		assertEquals(list2, a.noX(list2));
		assertEquals(Arrays.asList(""), a.noX(list3));
		assertEquals(list4, a.noX(list4));
	}

	@Test
	void testNoXFP() {
		assertNotEquals(list1, a.noX(list1));
		assertNotEquals(Arrays.asList("", "bb"), a.noX(list2));
		assertNotEquals(Arrays.asList(""), a.noX(list4));
	}
}
