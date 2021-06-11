package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurenceOfWords {
	
	public static void main(String[] args) {
		
		findDuplicateWords("java is language is java");
	}
	
	public static void findDuplicateWords(String str) {
		
		String words[] = str.split(" ");
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		System.out.println(wordCount);
		Iterator<String> it = wordCount.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int value = wordCount.get(key);
			System.out.println(key +":"+ value);
		}
		
		
	}

}
