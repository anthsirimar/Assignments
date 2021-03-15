package com.ss.mar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestLambdasWithInput {
	
	public static void main(String[] args) {
		TestLambdasWithInput test = new TestLambdasWithInput();
		String testPath = "resources/input.txt";
		test.runTests(testPath);
	}
	

	private void runTests(String testPath) {
		// try opening the input file
		try (FileReader fileReader = new FileReader(testPath);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			
			// for storing the information in the file
			Integer numTests = Integer.parseInt(bufferedReader.readLine());
			List<Integer> testTypes = new ArrayList<Integer>();
			List<Integer> numbers = new ArrayList<Integer>();

			// go through each line and record the numbers into the containers
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] splitLine = line.split(" ");
				testTypes.add(Integer.parseInt(splitLine[0]));
				numbers.add(Integer.parseInt(splitLine[1]));
			}
			
			printTestOutput(numTests, testTypes, numbers);

		} catch (Exception e) {
			System.out.println("Invalid input file");
		}
	}
	
	private void printTestOutput(int numTests, List<Integer> testTypes, List<Integer> numbers) {
		// Run the tests
		for (int i = 0; i < numTests; i++) {
			Lambdas lambda = new Lambdas();
			switch (testTypes.get(i)) {
			case 1:
				System.out.println((doOperation(lambda.isOdd(), numbers.get(i))
										? "ODD" : "EVEN"));
				break;
			case 2:
				System.out.println((doOperation(lambda.isPrime(), numbers.get(i))
										? "PRIME" : "COMPOSITE"));
				break;
			case 3:
				System.out.println((doOperation(lambda.isPalindrome(), numbers.get(i))
										? "PALINDROME" : "ASYMETRIC"));
				break;
			}
		}
	}

	private boolean doOperation(PerformOperation operation, int number) {
		return operation.isTrue(number);
	}
}
