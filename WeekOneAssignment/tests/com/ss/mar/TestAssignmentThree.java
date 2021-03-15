package com.ss.mar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestAssignmentThree {

	AssignmentThree a = new AssignmentThree();
	
	List<Integer> list1 = Arrays.asList(5,16,0,100,-4);
	List<Integer> list2 = Arrays.asList(2);
	List<Integer> list3 = Arrays.asList();
	
	@Test
	void TestDoubleIntsHP() {
		assertEquals(Arrays.asList(10,32,0,200,-8), a.doubling(list1));
		assertEquals(Arrays.asList(4), a.doubling(list2));
		assertEquals(Arrays.asList(), list3);
	}
	
	@Test
	void TestDoubleIntsFP() {
		assertNotEquals(list1, a.doubling(list1));
		assertNotEquals(Arrays.asList(5), a.doubling(list2));
	}

}
