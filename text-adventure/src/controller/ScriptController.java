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
package controller;

import model.Script;
import model.ScriptLoader;

/**
 * @author Mike
 *
 */
public class ScriptController {
	
	private final ScriptLoader loader;
	
	private Script currentScript;

	/**
	 * 
	 */
	public ScriptController() {
		loader = new ScriptLoader();
	}
	
	public void runScripts() {
		Script currentScript = loader.SCRIPTS.get("Intro");
		int currentLineNumber = 0;
		while (currentLineNumber != currentScript.lastLine()) {
			String currentLine = currentScript.nextLine();
			String[] tokens = currentLine.split(" ");
			
			switch (tokens[0]) {
				case "->":
					
				case ":":
					
				case "-":
					
				case "~":
					
				case "*":
					
				case "!":
					
				case "@":
					
				case "$":
					
				default:
					System.out.println(currentLine);
					currentLineNumber++;
			}
		}
	}
	
	public void runScript(Script script) {
		
	}

}
