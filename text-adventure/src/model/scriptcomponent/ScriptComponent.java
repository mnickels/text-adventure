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

/**
 * @author Mike Nickels
 * @version 0.1
 */
public interface ScriptComponent {
	
	/**
	 * Checks if this ScriptComponent is labeled with the specified String.
	 * 
	 * @param label the String label that is being compared to this ScriptComponent's label.
	 * 
	 * @return
	 */
	public boolean isLabel(String label);

}
