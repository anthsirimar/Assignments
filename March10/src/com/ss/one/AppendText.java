/**
 * 
 */
package com.ss.one;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Appends text to a text file.
 * @author Anthony
 *
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppendText appendText = new AppendText();
		
		String filePath = "resources/text.txt";
		
		System.out.println("Enter text to append: ");
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
			String toAppend = bufferedReader.readLine();
			appendText.appendTextToFile(filePath, toAppend);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void appendTextToFile(String filePath, String toAppend) throws IOException{
		try(FileInputStream in = new FileInputStream(filePath)){
			Files.write(Paths.get(filePath), toAppend.getBytes(), StandardOpenOption.APPEND);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
