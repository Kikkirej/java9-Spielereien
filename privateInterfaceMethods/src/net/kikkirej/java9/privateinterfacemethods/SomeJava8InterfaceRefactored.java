package net.kikkirej.java9.privateinterfacemethods;
/**
 * An interface, which declares default methods in Java 8 style <br>
 * A bit refactored.
 * @author Kikkirej
 * @since 14.07.2017
 * @see SomeJava8Interface
 */
public interface SomeJava8InterfaceRefactored {
	
	/**
	 * default implementation<br>
	 * Available with Java 1.8
	 */
	default void doSomething(String string) {
		doSomethingPrivate(string);
	}
	
	/**
	 * very similar implementation to "doSomething", but needs to be coded again.
	 */
	default void doSomethingElse(String string1, String string2) {
		doSomethingPrivate(string1 + string2);
	}
	
	/**
	 * Only internal needed, but publicly available...<br> 
	 * Bad design, but no other possibility in Java 8
	 */
	default void doSomethingPrivate(String string) {
		System.out.println(string);
	}
}
