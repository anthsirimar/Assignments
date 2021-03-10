/**
 * 
 */
package com.ss.mar;

/**
 * @author Anthony
 *
 */
public class ArrayMax {

	/**
	 * 
	 * Finds the position of the maximum value in a given 2D array
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] array = {{2,2,3,34}, {7,8,9,6}, {199,1,2,15}, {3,600,5,65}, {1,1,74,8}};
		int maxRow = 0;
		int maxCol = 0;
		
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				if(array[row][col] > array[maxRow][maxCol]) {
					maxRow = row;
					maxCol = col;
				}
			}
		}
		
		System.out.println("Max at [" + maxRow + "," + maxCol + "] is " + array[maxRow][maxCol]);

	}

}
