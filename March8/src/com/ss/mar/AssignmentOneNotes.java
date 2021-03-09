/**
 * 
 */
package com.ss.mar;

/**
 * @author Anthony
 * The patterns from the notes rather than the image.
 *
 */
public class AssignmentOneNotes {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AssignmentOneNotes assignmentOne = new AssignmentOneNotes();
		assignmentOne.printFirstPattern();
		System.out.println();
		assignmentOne.printSecondPattern();
		System.out.println();
		assignmentOne.printThirdPattern();
	}
	
	public void printFirstPattern() {
		System.out.println("1)");
		for(int i = 1; i <= 4; i++) {
			System.out.println("*".repeat(i));
		}
		System.out.println();
		System.out.println(".".repeat(5));
		System.out.println();
		System.out.println();
	}
	
	public void printSecondPattern() {
		System.out.println("2)");
		for(int i = 1; i <= 4; i++) {
			System.out.println(" ".repeat(4-i) + "*".repeat(i));
		}
		System.out.println();
		System.out.println(".".repeat(5));
		System.out.println();
	}
	
	public void printThirdPattern() {
		System.out.println("3)");
		System.out.println(".".repeat(5));
		for(int i = 4; i >= 1; i--) {
			System.out.println("*".repeat(i));
		}
	}

}
