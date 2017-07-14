package net.kikkirej.java9.osprocess.staticcalls;

import java.util.Optional;

/**
 * shows how to get a process of a specific PID
 * @author Kikkirej
 * @since 14.07.2017
 */
public class ProcessOfPID {

	public static void main(String[] args) {
		new ProcessOfPID().run();
	}

	private void run() {
		long pid = ProcessHandle.current().pid();
		Optional<ProcessHandle> processOfPid = ProcessHandle.of(pid);
		ProcessHandle processHandle = processOfPid.get();
		System.out.println(processHandle.info().toString());
	}

}
