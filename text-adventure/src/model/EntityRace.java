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

/**
 * @author Mike
 *
 */
public enum EntityRace {
	
	HUMAN("human", new int[] {10, 3, 2, 2}),
	MOLEMAN("moleman", new int[] {10, 1, 5, 4});
	
	private final String name;
	private final int[] levelScale;
	
	private EntityRace(String name, int[] scaling) {
		this.name = name;
		levelScale = scaling;
	}
	
	int[] getLevellingScale() {
		return levelScale;
	}
	
	public String getName() {
		return name;
	}

}
