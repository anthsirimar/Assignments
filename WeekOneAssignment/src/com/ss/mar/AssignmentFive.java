package com.ss.mar;

import java.util.List;

public class AssignmentFive {

	public boolean sumClump(int index, List<Integer> numbers, int sum) {

		//Check if the list is empty and if we've reached the end of the list
		if (numbers.size() == 0 || index >= numbers.size())
			return sum == 0;
		
		if(sum < 0)
			return false;

		int partialSum = 0;
		int jump = index; //jump is used to move the index forward over adjacent repeat numbers
		
		//get a partial sum.
		//If adjacent numbers are equal, they'll be added together into a single sum
		while (jump < numbers.size()
				&& numbers.get(index) == numbers.get(jump)) {
			jump++;
			partialSum += numbers.get(index);
		}
		
		//Go forward in the list while remembering what has been counted in this call
		if (sumClump(jump, numbers, sum - partialSum)) {
			return true;
		//go forward without remembering what has been counted in this call
		} else {
			return sumClump(jump, numbers, sum);
		}
	}

}
