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

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import model.Script;

public class ScriptLoader {
	
	public static final String[] SCRIPT_NAMES = {
			
	};
	
	public final Map<String, Script> SCRIPTS;

	public ScriptLoader() {
		SCRIPTS = new HashMap<String, Script>();
		for (String s : SCRIPT_NAMES) {
			SCRIPTS.put(s, new Script(new File(s)));
		}
	}

}
