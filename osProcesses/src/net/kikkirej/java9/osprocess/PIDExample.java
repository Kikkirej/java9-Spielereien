package net.kikkirej.java9.osprocess;

/**
 * An example for the new call of the process ID (PID) in Java 9
 * @author Kikkirej
 * @since 14.07.2017
 */
public class PIDExample {

	public static void main(String[] args) {
		new PIDExample().run();
	}

	private void run() {
		try {
			Process process = Runtime.getRuntime().exec("cmd /c echo Hello World");
			System.out.println(process.pid());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
