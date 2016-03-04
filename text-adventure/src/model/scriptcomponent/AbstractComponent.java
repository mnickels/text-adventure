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
package model.scriptcomponent;

import java.util.List;

/**
 * @author Mike Nickels
 * @version 0.1
 */
public abstract class AbstractComponent implements ScriptComponent {

	private final List<String> lines;
	private final String label;
	
	protected AbstractComponent(List<String> lines) {
		this(lines, "");
	}
	
	protected AbstractComponent(List<String> lines, String label) {
		this.label = label;
		this.lines = lines;
	}
	
	@Override
	public boolean isLabel(String label) throws IllegalArgumentException {
		if (label == null || label.isEmpty())
			throw new IllegalArgumentException("Cannot GOTO a null or empty label.");
		return this.label.equals(label);
	}

}
