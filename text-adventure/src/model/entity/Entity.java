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
 * Represents an entity, a living being in the game world.
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public class Entity {
	
	/** The name of this Entity. */
	private final String name;
	/** This Entity's Stats. */
	private Stats stats;
	
	private Morality morality;
	
	private EntityRace race;
	
	private EntityClass classification;

	/**
	 * Constructor for the Entity class.
	 */
	public Entity(String name) {
		this.name = name;
	}

}
