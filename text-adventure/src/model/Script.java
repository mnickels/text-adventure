package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Script {
	
	private int linePointer;
	
	private final List<String> lines;

	public Script(File scriptFile) {
		lines = new ArrayList<String>();
		try {
			Scanner s = new Scanner(scriptFile);
			while (s.hasNextLine()) {
				lines.add(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		linePointer = 0;
	}
	
	/**
	 * Gets the next line to run.
	 * 
	 * @return A String of steamScript. Returns null if the script has concluded running.
	 */
	public String nextLine() {
		if (linePointer < lines.size()) {
			return lines.get(linePointer++);
		}
		return null;
	}

}
