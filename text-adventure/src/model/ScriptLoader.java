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
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public class ScriptLoader {
	
	public static final String[] SCRIPT_NAMES = {
			"Intro.txt"
	};
	
	public final Map<String, Script> SCRIPTS;

	public ScriptLoader() {
		SCRIPTS = new HashMap<String, Script>();
		for (String s : SCRIPT_NAMES) {
			SCRIPTS.put(s, new Script(new File(s)));
		}
	}
	
	/**
	 * Returns the Script with the given file name.
	 * 
	 * @param name File name. 
	 * @return Script with given file name.
	 */
	public Script getScript(String name) {
		return SCRIPTS.get(name);
	}

}
