package net.kikkirej.java9.osprocess.processhandle;

/**
 * example for the new API to get current process.
 * @author Kikkirej
 * @since 14.07.2017
 */
public class CurrentProcess {
	public static void main(String[] args) {
		new CurrentProcess().run();
	}

	private void run() {
		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println(processHandle.pid());
	}
}
