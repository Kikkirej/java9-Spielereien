package net.kikkirej.java9.osprocess;

import java.util.stream.Stream;

/**
 * Uses the new Method to get a Stream with all Processes and writes it to stdout
 * @author Kikkirej
 * @since 14.07.2017
 */
public class AllProcesses {
	
	public static void main(String[] args) {
		new AllProcesses().run();
	}

	private void run() {
		Stream<ProcessHandle> allProcesses = ProcessHandle.allProcesses();
		allProcesses.forEach(p -> System.out.println(p));
	}
	
}
