/*
 * generated by Xtext
 */
package org.yazgel.regex.s2m;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class S2MStandaloneSetup extends S2MStandaloneSetupGenerated{

	public static void doSetup() {
		new S2MStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

