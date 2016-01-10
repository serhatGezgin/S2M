package org.yazgel.regex.s2m.generator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.yazgel.regex.s2m.s2M.Attribute;
import org.yazgel.regex.s2m.s2M.Rule;
import org.yazgel.regex.s2m.s2M.impl.ModelImpl;

public class MapGenerator implements IGenerator<Map<String, Object>> {
	
	private Map<String, Object> map;
	private String text;
	
	public MapGenerator(String text) {
		map = new HashMap<String, Object>();
		this.text = text;
	}

	@Override
	public Map<String, Object> generate(Resource resource, IFileSystemAccess fsa) {
		try {
			ModelImpl model = (ModelImpl) resource.getContents().get(0);
			EList<Rule> rules = model.getRules();
			
			for (Rule rule : rules) {
				Attribute attr = rule.getAttr();
				
				String attrName = attr.getName();
				
				int startIndex = rule.getStartIndex();
				int endIndex = rule.getEndIndex();
				
				String substring = text.substring(startIndex, endIndex + 1);
				map.put(attrName, substring);
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return map;
	}

}
