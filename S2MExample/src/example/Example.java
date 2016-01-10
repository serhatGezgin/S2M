package example;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.yazgel.regex.s2m.generator.S2MRunner;


public class Example {
	
	private static final String COMMAND = "012345Serhat";
	
	public static void main(String[] args) {
		String filePath = "file:/" + new File("model/deneme.s2m").getAbsolutePath();
		String[] myStrings = { filePath, COMMAND};
		long startTime = System.currentTimeMillis();
		S2MRunner.main(myStrings); 
		Map<String, Object> result = S2MRunner.getResult();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		Set<Entry<String, Object>> entrySet = result.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
	}
}
