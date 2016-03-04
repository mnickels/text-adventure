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
	
	/**
	 * List of components generated from similar blocks of script text.
	 */
	private final List<ScriptComponent> components;
	
	/**
	 * Current component being used.
	 */
	private int currentIndex;

	/**
	 * Creates a new Script from the provided File.
	 * 
	 * @param scriptFile the Script File.
	 */
	public Script(File scriptFile) {
		components = new ArrayList<ScriptComponent>();
		currentIndex = 0;
		readFile(scriptFile);
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

			Map<Integer, String> lineNumberToLabel = fillLabels(lines);
			
			populateComponents(lines, lineNumberToLabel);
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
	private Map<Integer, String> fillLabels(List<String> script) {
		Map<Integer, String> theLabels = new HashMap<Integer, String>();
		int currentSize = script.size();
		for (int i = 0; i < currentSize; i++) {
			String line = script.get(i);
			if (line.startsWith(Keyword.LABEL.getKey())) { //Check if line is a label
				String[] words = line.split(" ");
				theLabels.put(i, words[1]);
				script.remove(i--); //Removes the label from the lines of script text
				currentSize--;
			}
		}
		return theLabels;
	}
	
	private void populateComponents(List<String> lines, Map<Integer, String> labels) {
		
//		if (labels.containsKey(i)) {
//			component.addLabel(labels.get(i));
//		}
		
		List<String> grouped = new ArrayList<String>();
		grouped.add(lines.get(0));
		
		for (int i = 1; i < lines.size(); i++) {
			if (lines.get(i).startsWith(grouped.get(grouped.size() - 1).split(" ")[0])) {
				grouped.add(lines.get(i));
			} else {
				switch (grouped.get(grouped.size() - 1).split(" ")[0]) {
					case Keyword.COMMENT.getKey():
						System.out.println("You're an idiot!");
						break;
					case Keyword.GOTO.getKey():
						break;
					case Keyword.IF.getKey():
						break;
					case Keyword.CONDITION_OR.getKey():
						break;
					case Keyword.CONDITION_AND.getKey():
						break;
					case Keyword.BRANCH_TRUE.getKey():
						break;
					case Keyword.BRANCH_FALSE.getKey():
						break;
					case Keyword.INPUT_BUTTON.getKey():
						break;
					case Keyword.REFERENCE_GLOBAL.getKey():
						break;
					case Keyword.REFERENCE_LOCAL.getKey():
						break;
					case Keyword.LABEL.getKey():
						System.out.println("You're an idiot!");
						break;
					default:
				}
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
