package com.ss.mar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestAssignmentTwo {
	AssignmentTwo a = new AssignmentTwo();
	
	List<Integer> list1 = Arrays.asList(5,16,45,103,9001);
	List<Integer> list2 = Arrays.asList(102,792,222224, 100);
	List<Integer> list3 = Arrays.asList();

	
	@Test
	void testRightMostDigitsHP() {
		assertEquals(Arrays.asList(5,6,5,3,1), a.rightDigit(list1));
		assertEquals(Arrays.asList(2,2,4,0), a.rightDigit(list2));
		assertEquals(Arrays.asList(), a.rightDigit(list3));
	}
	
	@Test
	void testRightMostDigitFP() {
		assertNotEquals(list1, a.rightDigit(list1));
	}

}
