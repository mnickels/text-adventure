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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import model.scriptcomponent.ScriptComponent;

/**
 * Holds the data for the game's script and reads through it.
 * @author Mike Nickels
 * @version 0.1
 */
public class Script {
	
	private final List<ScriptComponent> components;
	
	private final Map<String, Integer> labelToLineNumber;
	
	private int currentIndex;

	/**
	 * Creates a new Script from the provided File.
	 * 
	 * @param scriptFile the Script File.
	 */
	public Script(File scriptFile) {
		components = new ArrayList<ScriptComponent>();
		labelToLineNumber = new HashMap<String, Integer>();
		currentIndex = 0;
		readFile(scriptFile);
		removeComments();
		fillLabels();
	}
	
	/**
	 * Reads the lines of the given File and puts them into a String array.
	 * 
	 * @param f the File to read from.
	 */
	private void readFile(File f) {
		if (f == null) {
			throw new IllegalArgumentException("Null script file.");
		}
		try {
			List<String> lines = new ArrayList<String>();
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				lines.add(s.nextLine());
			}
			s.close();
			removeComments(lines);
			fillLabels(lines);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// Does not throw if the file can't be found, so WILL create an empty Script object
		}
	}
	
	private void removeComments(List<String> script) {
		script.removeIf(line -> line.startsWith(Keyword.COMMENT.getKey()));
	}
	
	/**
	 * 
	 */
	private void fillLabels(List<String> script) {
		int currentSize = script.size();
		for (int i = 0; i < currentSize; i++) {
			String line = script.get(i);
			if (line.startsWith(Keyword.LABEL.getKey())) {
				// This line is a Label
				String[] words = line.split(" ");
				labelToLineNumber.put(words[1], i);
				components.remove(i--);
				currentSize--;
			}
		}
	}
	
	/**
	 * Gets the current line and advances to the next one.
	 * 
	 * @return the current line.
	 */
	public String nextLine() {
		if (currentIndex < components.size()) {
			//return lines.get(linePointer++);
			return components.get(currentIndex++);
		}
		return null;
	}
	
	/**
	 * Jumps to the specified label.
	 * 
	 * @param label the label to jump to.
	 */
	public void gotoLabel(String label) {
		currentIndex = labelToLineNumber.get(label);
	}
	
	/**
	 * Gets the last line of this Script.
	 * 
	 * @return The last line of this Script.
	 */
	public int lastLine() {
		return components.size();
	}

}
