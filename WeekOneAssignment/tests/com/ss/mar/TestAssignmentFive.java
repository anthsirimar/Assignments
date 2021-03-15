package com.ss.mar;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestAssignmentFive {
	AssignmentFive a = new AssignmentFive();
	
	
	@Test
	void testSumClumpTrue() {
		assertTrue(a.sumClump(0, Arrays.asList(), 0));
		
		assertTrue(a.sumClump(0,Arrays.asList(2), 2));
		assertTrue(a.sumClump(0,Arrays.asList(2,2), 4));
		
		assertTrue(a.sumClump(0,Arrays.asList(2,4,8), 10));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,8), 6));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,8), 8));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,8), 2));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,8), 4));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,8), 14));
		
		assertTrue(a.sumClump(0,Arrays.asList(2,4,4,8), 10));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,4,8), 16));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,4,8), 8));
		assertTrue(a.sumClump(0,Arrays.asList(2,4,4,8), 18));
		assertTrue(a.sumClump(0,Arrays.asList(2,2,2,2,2,2,2), 14));
		assertTrue(a.sumClump(0,Arrays.asList(2,2,2,1,2,2,2,2), 7));
		assertTrue(a.sumClump(0,Arrays.asList(2,2,2,1,2,2,2,2), 9));
		assertTrue(a.sumClump(0,Arrays.asList(2,2,2,1,2,2,2,2), 15));
	}
	
	@Test
	void testSumClumpFalse() {
		assertFalse(a.sumClump(0, Arrays.asList(), 1));
		
		assertFalse(a.sumClump(0,Arrays.asList(2), 3));
		assertFalse(a.sumClump(0,Arrays.asList(2,2), 2));
		
		assertFalse(a.sumClump(0,Arrays.asList(2,4,8), 30));
		assertFalse(a.sumClump(0,Arrays.asList(2,4,8), 16));
		assertFalse(a.sumClump(0,Arrays.asList(2,4,8), 1));
		
		assertFalse(a.sumClump(0,Arrays.asList(2,4,4,8), 12));
		assertFalse(a.sumClump(0,Arrays.asList(2,4,4,8), 6));
		assertFalse(a.sumClump(0,Arrays.asList(2,2,2,2,2,2,2), 2));
		assertFalse(a.sumClump(0,Arrays.asList(2,2,2,1,2,2,2,2), 3));
		assertFalse(a.sumClump(0,Arrays.asList(2,2,2,1,2,2,2,2), 4));
	}

}
