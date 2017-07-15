package net.kikkirej.java9.osprocess;

/**
 * shows the call "toHandle()" Method from {@link Process}. <br>
 * This method returns a {@link ProcessHandle} of a {@link Process}.
 * @author Kikkirej
 * @since 15.07.2017
 */
public class ToHandle {
	public static void main(String[] args) {
		new ToHandle().run();
	}

	@SuppressWarnings("unused")
	private void run() {
		try {
			Process process = Runtime.getRuntime().exec("cmd /c echo Hello World");
			ProcessHandle processHandle = process.toHandle();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
