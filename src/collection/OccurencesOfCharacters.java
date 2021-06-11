package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.Character;

public class OccurencesOfCharacters {
	
	
	public static void getCharCount(String str) {
		
	
		char charr[] = str.toCharArray();
		
		Map<Character, Integer> ref = new HashMap<Character, Integer>();
		for(char ch : charr) {
			//if the character is present
			if(ref.containsKey(ch)) {
				ref.put(ch, ref.get(ch)+1);
				
			}else {
				ref.put(ch, 1);
			}
		}
		
		Iterator<Character> it = ref.keySet().iterator();
		
		while(it.hasNext()) {
			char cname = it.next();
			int cvalue = ref.get(cname);
			     if(cvalue >1) {
			    	 System.out.println(cname +":"+cvalue);
			     }
			}
		
		
	}
	
	public static void main(String[] args){
		
		String str = "Hello World";
		
		 getCharCount(str);
		
	}
}
