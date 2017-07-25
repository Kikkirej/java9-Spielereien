package net.kikkirej.java9.deprecation;

import java.security.Certificate;

/**
 * Shows deprecation in method and import
 * @author Kikkirej
 */
public class DeprecationWarning {
	
	void foo() {
		Certificate certificate = null;
		
		System.out.println(certificate); //Only for not showing error for unused
	}
}
