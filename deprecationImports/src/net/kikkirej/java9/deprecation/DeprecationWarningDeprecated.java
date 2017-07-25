package net.kikkirej.java9.deprecation;

import java.security.Certificate;

/**
 * Shows deprecation in import
 * @author Kikkirej
 */
public class DeprecationWarningDeprecated {
	
	@Deprecated
	void foo() {
		Certificate certificate = null;
		
		System.out.println(certificate); //Only for not showing error for unused
	}
}
