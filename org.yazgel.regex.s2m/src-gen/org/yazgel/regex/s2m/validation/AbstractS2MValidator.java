/*
 * generated by Xtext
 */
package org.yazgel.regex.s2m.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractS2MValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.yazgel.regex.s2m.s2M.S2MPackage.eINSTANCE);
		return result;
	}
}
