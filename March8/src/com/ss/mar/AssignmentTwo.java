/**
 * 
 */
package com.ss.mar;

import java.util.Scanner;

/**
 * Second assignment for 3/8/2021
 * Asks the user for a random number and plays a game
 * @author Anthony
 *
 */
public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AssignmentTwo assignmentTwo = new AssignmentTwo();
		int maxAttempts = 5;
		
		
		
		//pick a random number between 1 and 100
		int randomNumber = 1 + (int)(Math.random() * 100);
		System.out.println(randomNumber);
		
		System.out.print("Try to guess the random number. Enter an integer between 1 and 100: ");
		int currentAttempt = 1;
		while(true)
		{
			int userNumber;
			//Get the user's input and make sure it's an integer
			try {
				Scanner scanner = new Scanner(System.in);
				userNumber = scanner.nextInt();
			}
			catch(Exception e){
				System.out.println("Please enter an integer");
				continue;
			}
			
			//check it's between 1 and 100
			if(userNumber < 1 || userNumber > 100) {
				System.out.println("Please pick an integer between 1 and 100");
				continue;
			}
			
			
			//check if the number is within 10 +/- the random number
			if( userNumber <= randomNumber + 10 && randomNumber - 10 <= userNumber) {
				System.out.println("Correct! The number was " + randomNumber );
				break;
			}
			else {
				if(currentAttempt == maxAttempts)
				{
					System.out.println("Sorry");
					break;
				}
				System.out.println("Not right. Try again. ");
			}		
			++currentAttempt;

		}

	}

	public int getUserNumber() {
		Scanner scanner = new Scanner(System.in);
		int userNumber = scanner.nextInt();
		return userNumber;
	}
	
}
