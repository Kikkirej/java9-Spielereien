package net.kikkirej.java9.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DropWhile {

	public static void main(String[] args) {
		new DropWhile().run();
	}
	
	private void run() {
		Stream<String> exampleStream = getExampleStream(); //contains: arnold, brigitte, florian, olaf
		exampleStream.dropWhile(s -> !s.equals("florian")).forEach(System.out::println);
		//writes out: florian olaf
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
