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
 * Represents an entity, a living being in the game world.
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public class Entity {
	
	private final String name;
	
	private Stats stats;
	
	private double morality;
	
	private EntityRace race;
	
	private EntityClass classification;

	/**
	 * 
	 */
	public Entity(String name) {
		this.name = name;
	}

}
