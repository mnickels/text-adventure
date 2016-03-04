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
public class OutputComponent extends AbstractComponent {
	


	public OutputComponent(List<String> lines) {
		this(lines, "");
	}

	public OutputComponent(List<String> lines, String label) {
		super(lines, label);
	}

}
