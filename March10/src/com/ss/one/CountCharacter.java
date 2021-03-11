/**
 * 
 */
package com.ss.one;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Counts the number of instances of a character in a text file.
 * 
 * @author Anthony
 *
 */
public class CountCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountCharacter countCharacter = new CountCharacter();

		String filePath = "resources/text.txt";

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				System.out.print("Enter a character to count: ");
				String userInput = bufferedReader.readLine();
				if (userInput.length() != 1) {
					System.out.println("Please only enter a single character.");
					continue;
				} else {
					char toCount = userInput.toCharArray()[0];
					System.out.println(countCharacter.countCharacterInFile(filePath, toCount));
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int countCharacterInFile(String filePath, char toCount) throws IOException {
		int answer = 0;
		try (FileInputStream in = new FileInputStream(filePath)) {
			// count occurences of the character
			int currentChar;
			while ((currentChar = in.read()) != -1) {
				if (currentChar == toCount)
					answer++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return answer;
	}
}
