/**
 * 
 */
package controller;

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
		scripts = new ScriptController();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new MainController()).start();
	}

	@Override
	public void run() {
		
	}

}
