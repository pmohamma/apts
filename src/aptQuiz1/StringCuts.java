package aptQuiz1;

import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> wordSet = new ArrayList<String>();
        for (String word : list) {
        	if ((word.length()>=minLength) && !(wordSet.contains(word))) {
        		wordSet.add(word);
        	}
        }
        String[] ret = wordSet.toArray(new String[wordSet.size()]);
        return ret;
    }
}