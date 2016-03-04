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
 * Holds the Stats values for Entities.
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public class Stats {
	
	public enum Stat {
		HEALTH, ATTACK, DEFENSE, SPEED, LEVEL
	}
	
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

	private EntityRace race;
	private EntityClass eClass;
	
	
	
	public Stats(EntityRace r, EntityClass c) {
		race = r;
		eClass = c;
	}
	
	public void changeClass(EntityClass c) {
		eClass = c;
	}
	
	public int getStat(Stat s) {
		switch (s) {
		case HEALTH:
			return health;
		case ATTACK:
			return attack;
		case DEFENSE:
			return defense;
		case SPEED:
			return speed;
		case LEVEL:
			return level;
		}
		return -1;
	}

}
