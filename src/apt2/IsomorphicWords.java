package apt2;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicWords {
	public int countPairs(String[] words) {
        int total = 0;
        
        for (int j = 0; j < words.length; j++) {
        	String jword = helper(words[j]);
        	for (int k = j+1; k < words.length; k++) {
        		String kword = helper(words[k]);
        		if (jword.equals(kword)) {
        			total+=1;
        		}
        	}
        }
		return total;
     }
	
	private String helper(String s) {
		char[] word = s.toLowerCase().toCharArray();
		Map<Character, Character> existing = new HashMap<Character, Character>();
		char counter = 'a';
		for (int c = 0; c < word.length; c++) {
			char ch = word[c];
			if (existing.containsKey(ch)) {
				word[c] = existing.get(ch);
			}
			else {
				existing.put(word[c], counter);
				word[c] = counter;
				counter += 1;
			}
		}
		return (new String(word));
	}
}
