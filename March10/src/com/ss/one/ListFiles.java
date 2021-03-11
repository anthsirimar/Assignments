/**
 * 
 */
package com.ss.one;

import java.io.File;

/**
 * Lists all the files and subdirectories in a given directory
 * @author Anthony
 *
 */
public class ListFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListFiles list = new ListFiles();
		
		String path = args[0];
		try {
			list.listFiles(path);
		}
		catch(Exception e)
		{
			System.out.println("Path does not exist.");
		}
		
	}
	
	public void listFiles(String startingPath) {
		File directory = new File(startingPath);
		File[] files = directory.listFiles();
		for(File file : files) {
			System.out.println(file.getAbsolutePath());
			//If this file is a directory, then call this method again on it
			if(file.isDirectory())
				listFiles(file.getAbsolutePath());
		}
	}

}
