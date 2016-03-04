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
package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 * GUI for the program.
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public class GUI extends JFrame {
	/**
	 * Default ID.
	 */
	private static final long serialVersionUID = 1L;

	private static final String TITLE = "Steampunk Text-Based Adventure Game";
	
	public GUI() {
		super(TITLE);
		this.setVisible(true);
	}
	
	private class DisplayedText extends JScrollPane {
		
		
		
	}
	
}
