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

import model.ScriptLoader;

/**
 * @author Mike
 *
 */
public class ScriptController {
	
	public static final String[] keywords = {
		"->", ":", "-", "~", "*", "!", "@"
	};
	
	private final ScriptLoader loader;

	/**
	 * 
	 */
	public ScriptController() {
		loader = new ScriptLoader();
	}
	
	public void runScripts() {
		
	}

}
