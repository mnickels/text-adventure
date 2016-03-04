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

import java.util.ArrayList;
import java.util.List;

/**
 * Holds the moral value of an Entity.
 * 
 * @author Mike Nickels
 * @version 0.1
 */
public class Morality implements Comparable<Morality> {
	
	/** Minimum moral quality. */
	private static final double MINIMUM = -10.0;
	/** Maximum moral quality. */
	private static final double MAXIMUM = 10.0;
	
	/*
	 * LEVELS OF MORALITY
	 *  based on all decisions made with this Morality (using the makeDecision(Morality) method)
	 *  in descending order from most "bad" to most "good":
	 * EVIL = [0%,12.5%) morality
	 * HORRIBLE = [12.5%,25%) morality
	 * BAD = [25%,37.5%) morality
	 * MISGUIDED = [37.5%,50%) morality
	 * NEUTRAL = [50%,62.5%) morality
	 * OKAY = [62.5%,75%) morality
	 * GOOD = [75%,87.5%) morality
	 * HONORABLE = [87.5%,100%) morality
	 * RIGHTEOUS = 100% morality
	 */
	public static final double EVIL = MINIMUM;
	public static final double HORRIBLE = MINIMUM + (MAXIMUM - MINIMUM) / 8;
	public static final double BAD = MINIMUM + (MAXIMUM - MINIMUM) / 4;
	public static final double MISGUIDED = MINIMUM + (MAXIMUM - MINIMUM) * 3 / 8;
	public static final double NEUTRAL = (MINIMUM + MAXIMUM) / 2;
	public static final double OKAY = MINIMUM + (MAXIMUM - MINIMUM) * 5 / 8;
	public static final double GOOD = MINIMUM + (MAXIMUM - MINIMUM) * 3 / 4;
	public static final double HONORABLE = MINIMUM + (MAXIMUM - MINIMUM) * 7 / 8;
	public static final double RIGHTEOUS = MAXIMUM;
	/** Precision to use when comparing Moralities. Set to 100, == .01 precision. */
	private static final int COMPARE_PRECISION = 100;
	
	/** All past decisions made using this Morality. */
	private final List<Double> decisions;
	/** The morality level  */
	private double morality;

	/**
	 * Creates a neutral Morality.
	 */
	public Morality() {
		this(NEUTRAL);
	}
	
	/**
	 * Creates a Morality with the specified initial moral level.
	 * @param initialLevel the initial moral level of this Morality.
	 */
	public Morality(final double initialLevel) {
		if (initialLevel < MINIMUM) morality = MINIMUM;
		else if (initialLevel > MAXIMUM) morality = MAXIMUM;
		else morality = initialLevel;
		
		decisions = new ArrayList<Double>();
		decisions.add(morality);
	}
	
	/**
	 * Adds the moral value of the Morality provided to this Morality.
	 * @param m the Morality of the decision being made.
	 */
	public void makeDecision(Morality m) {
		decisions.add(m.morality);
		// TODO make this a sum of ALL decisions
		morality = (morality + m.morality) / 2;
	}
	
	/**
	 * Returns a negative number if this Morality is more immoral than the one being compared to.
	 */
	@Override
	public int compareTo(final Morality m) {
		return (int) ((morality - m.morality) * COMPARE_PRECISION);
	}
	
	@Override
	public String toString() {
		return String.format("Morality [morality=%d]", morality);
	}
	
}
