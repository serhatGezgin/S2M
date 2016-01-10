package org.yazgel.regex.s2m.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

public interface IGenerator<T> {
	T generate(Resource resource, IFileSystemAccess fsa);
}
