/*
 * generated by Xtext 2.13.0
 */
package com.ufcg.compiladores


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GoStandaloneSetup extends GoStandaloneSetupGenerated {

	def static void doSetup() {
		new GoStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
