/**
 * 
 */
package com.ss.mar;

/**
 * First assignment for 3/8/2021
 * Prints the text patterns from the image in the slides
 * @author Anthony
 *
 */
public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AssignmentOne assignmentOne = new AssignmentOne();
		assignmentOne.printFirstPattern();
		System.out.println();
		assignmentOne.printSecondPattern();
		System.out.println();
		assignmentOne.printThirdPattern();
		System.out.println();
		assignmentOne.printFourthPattern();
	}
	
	public void printFirstPattern() {
		System.out.println("1)");
		for(int i = 1; i <= 4; i++) {
			System.out.println("*".repeat(i));
		}
		System.out.println(".".repeat(9));
	}
	
	public void printSecondPattern() {
		System.out.println("2)");
		System.out.println(".".repeat(10));
		for(int i = 4; i >= 1; i--) {
			System.out.println("*".repeat(i));
		}
	}
	
	public void printThirdPattern() {
		System.out.println("3)");
		for(int i = 0; i <= 3; i++ ) {
			System.out.println(" ".repeat(5-i) + "*".repeat(2*i+1));
		}
		System.out.println(".".repeat(11));
	}
	
	public void printFourthPattern() {
		System.out.println("4)");
		System.out.println(".".repeat(12));
		for(int i = 3; i  >= 0; i--) {
			System.out.println(" ".repeat(5-i) + "*".repeat(2*i+1));
		}
	}
	
	

}
