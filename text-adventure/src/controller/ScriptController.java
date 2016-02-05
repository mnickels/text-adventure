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

import java.util.ArrayList;
import java.util.List;

import model.Script;
import model.ScriptLoader;

/**
 * @author Mike
 * @author Paul Zander
 */
public class ScriptController {
	
	private final ScriptLoader loader;
	
	private Script currentScript;

	/**
	 * 
	 */
	public ScriptController() {
		loader = new ScriptLoader();
		currentScript = loader.getScript("Intro.txt");
	}
	
	public String getNextOutput() {
		String output = "";
		
		return output;
	}
	
	public List<String> getNextOptions() {
		List<String> options = new ArrayList<String>();
		
		return options;
	}

}
