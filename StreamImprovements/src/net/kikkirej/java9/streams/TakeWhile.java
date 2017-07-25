package net.kikkirej.java9.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Take while walks through a string as long as a condition is true.
 * 
 * @author Kikkirej
 */
public class TakeWhile {
	public static void main(String[] args) {
		new TakeWhile().run();
	}

	private void run() {
		Stream<String> exampleStream = getExampleStream(); //contains: arnold, brigitte, florian, olaf
		exampleStream.takeWhile(s -> !s.equals("florian")).forEach(System.out::println);
		//writes out: arnold brigitte
	}

	private Stream<String> getExampleStream() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("arnold");
		arrayList.add("brigitte");
		arrayList.add("florian");
		arrayList.add("olaf");
		return arrayList.stream();
	}
}
