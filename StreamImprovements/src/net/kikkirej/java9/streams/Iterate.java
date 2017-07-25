package net.kikkirej.java9.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * With iterate you can build something like for loops with streams<br>
 * Example idea by <b>codefx.org</b>
 * @author Kikkirej
 */
public class Iterate {
	public static void main(String[] args) {
		Iterate iterate = new Iterate();
		iterate.runWithI();
		iterate.runWithEnumeration();
	}

	private void runWithI() {
		Stream.iterate(1, i-> i<=10, i -> 2*i).forEach(System.out::println);
		//writes out: 1 2 4 8
	}
	
	private void runWithEnumeration() {
		Iterator<Integer> exampleIterator = getExampleIterator();
		Stream.iterate(exampleIterator.next(), 
				el -> exampleIterator.hasNext(), 
				el -> exampleIterator.next()).
		forEach(System.out::println);
		//should write out: 2 5 27
		//but writes out: 2 5
		//DOESN'T WORK (although it seems pretty cool)
	}

	private Iterator<Integer> getExampleIterator() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(7);
		return arrayList.iterator();
	}
}
