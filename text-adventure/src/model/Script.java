/*
 * HuSCII Coding Club
 * 
 * Steampunk Text-Based Adventure Game
 * 
 * created by (in no particular order)
 * Mike Nickels
 * Patrick Cruz
 * Big Paul
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Holds the data for the game's script and reads through it.
 * @author Mike Nickels
 * @version 0.1
 */
public class Script {
	
	private int linePointer;
	
	private final List<String> lines;

	public Script(File scriptFile) {
		if (scriptFile == null) {
			throw new IllegalArgumentException("Null script file.");
		}
		lines = new ArrayList<String>();
		try {
			Scanner s = new Scanner(scriptFile);
			while (s.hasNextLine()) {
				lines.add(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// Does not throw if the file can't be found, so WILL create an empty Script object
		}
	}
	
	
	/**
	 * Gets the next line to run.
	 * 
	 * @return A String of steamScript. Returns null if the script has concluded running.
	 */
	public String nextLine(int lineNumber) {
		if (lineNumber >= lines.size()) {
			return lines.get(linePointer++);
		}
		return null;
	}

}
