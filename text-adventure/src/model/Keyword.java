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
 * @version 0.1
 */
public enum Keyword {
	
	COMMENT("//"),
	GOTO("->"),
	IF(":if"),
	CONDITION_AND("-"),
	CONDITION_OR("~"),
	BRANCH_TRUE("*"),
	BRANCH_FALSE("!"),
	INPUT_BUTTON("@"),
	REFERENCE_GLOBAL("#"),
	REFERENCE_LOCAL("$"),
	LABEL("%"),
	OUTPUT_TEXT("");
	
	private final String key;
	
	Keyword(String key) {
		this.key = key;
	}
	
	public static Keyword getKeyword(String s) {
		for (Keyword k : values()) {
			if (s.equals(k.getKey())) {
				return k;
			}
		}
		return OUTPUT_TEXT;
	}
	
	public String getKey() {
		return key;
	}

}
