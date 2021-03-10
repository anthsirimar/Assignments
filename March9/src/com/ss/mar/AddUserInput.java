/**
 * 
 */
package com.ss.mar;

/**
 * Prints the sum of the arguments given by the user
 * 
 * @author Anthony
 *
 */
public class AddUserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Float sum = 0f;

		try {
			//loop through and add the numbers
			for (String i : args) {
				sum += Float.parseFloat(i);
			}
			System.out.println("Sum = " + sum);
		}
		catch (Exception e) {
			System.out.println("Please only give number arguments.");
		}

	}

}
