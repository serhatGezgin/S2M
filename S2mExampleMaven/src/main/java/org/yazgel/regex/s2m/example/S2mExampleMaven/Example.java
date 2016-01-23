package org.yazgel.regex.s2m.example.S2mExampleMaven;

import org.yazgel.regex.s2m.generator.GenerationType;
import org.yazgel.regex.s2m.generator.S2MRunner;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

	private static final String COMMAND = "012345Serhat";

	public static void main(String[] args) {
		String filePath = "file:/" + Example.class.getResource("/model/deneme.s2m").getFile().toString();

		long startTime = System.currentTimeMillis();
		Map<String, Object> result = (Map<String, Object>) S2MRunner.getInstance().run(filePath, COMMAND,
				GenerationType.HASH_MAP);
		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;
		System.out.println(totalTime);

		Set<Entry<String, Object>> entrySet = result.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
