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
 * @author Mike
 *
 */
public class Stats {
	
	private int maxHealth;
	private int maxAtk;
	private int maxDef;
	private int maxSpd;
	
	private int health;
	private int attack;
	private int defense;
	private int speed;
	
	private int level;
	private double xp;
	
	private double morality;

	/**
	 * 
	 */
	public Stats(EntityRace r, EntityClass c) {
		
	}
	
	public Stats(Stats s, EntityRace r, EntityClass c) {
		
	}

}
