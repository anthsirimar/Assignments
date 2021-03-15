package com.ss.mar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class EvenOddTest {

	EvenOdd eo = new EvenOdd();
	
	List<Integer> nums1 = Arrays.asList(0,1,2,3,100);
	List<Integer> nums2 = Arrays.asList(15, 13, 8, 100);
	List<Integer> nums3 = Arrays.asList(30);
	
	
	@Test
	public void testEvenOddHP() {
		assertEquals("e0,o1,e2,o3,e100", eo.buildString(nums1));
		assertEquals("o15,o13,e8,e100", eo.buildString(nums2));
		assertEquals("e30", eo.buildString(nums3));
	}

	@Test
	public void testEvenOddFP() {
		assertNotEquals("o0,e1,o2,e3,o100", eo.buildString(nums1));
		assertNotEquals("o15,o13,e8,e100,", eo.buildString(nums2));
		assertNotEquals("o30", eo.buildString(nums3));
	}
	
}
