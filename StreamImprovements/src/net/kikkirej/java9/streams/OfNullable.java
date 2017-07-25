package net.kikkirej.java9.streams;

import java.util.stream.Stream;

/**
 * Creates a Stream of null or a single Element
 * @author Kikkirej
 */
public class OfNullable {
	
	public static void main(String[] args) {
		new OfNullable().runWithI();
	}

	private void runWithI() {
		long nullValue = Stream.ofNullable(null).count();
		System.out.println(nullValue); //Should return '0'
		long oneValue = Stream.ofNullable("foo").count();
		System.out.println(oneValue); //Should return '1'
	}
}
