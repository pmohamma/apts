package apt2;

import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
	public int points(String[] player, String[] dictionary) {
		int ret = 0;
		HashSet<String> playerSet = new HashSet<String>(Arrays.asList(player));
		HashSet<String> dictionarySet = new HashSet<String>(Arrays.asList(dictionary));
		for (String s : playerSet) {
			if (dictionarySet.contains(s)) {
				ret += (Math.pow(s.length(),2));
			}
		}
		return ret;
	}
}
