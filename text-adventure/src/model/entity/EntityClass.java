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
package model.entity;

/**
 * The Job/Class of Entities.
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public enum EntityClass {
	
	BRAWLER("brawler", new int[] {10, 3, 2, 2});
	
	private final String name;
	private final int[] levelScale;
	
	private EntityClass(String name, int[] scaling) {
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
