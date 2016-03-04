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

import view.GUI;

/**
 * @author Mike
 *
 */
public class MainController implements Runnable {
	
	ScriptController scripts;

	/**
	 * 
	 */
	public MainController() {
		//scripts = new ScriptController();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new MainController()).start();
	}

	@Override
	public void run() {
		GUI view = new GUI();
		//scripts.runScripts();
	}

}
