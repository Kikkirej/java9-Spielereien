package net.kikkirej.java9.privateinterfacemethods;
/**
 * An interface, which declares default and private Methods 
 * @author Kikkirej
 * @since 14.07.2017
 */
public interface SomeJava9Interface {

	/**
	 * Same method like in {@link SomeJava8Interface}
	 * @see SomeJava8Interface
	 */
	default void doSomething(String string) {
		doSomethingPrivate(string);
	}
	
	/**
	 * Same method like in {@link SomeJava8Interface}
	 * @see SomeJava8Interface
	 */
	default void doSomethingElse(String string1, String string2) {
		doSomethingPrivate(string1 + string2); 
	}
	
	/**
	 * private Method, which isn't available outside the interface, but can be used by default and other private methods
	 */
	private void doSomethingPrivate(String string) {
		System.out.println(string);
	}
}
