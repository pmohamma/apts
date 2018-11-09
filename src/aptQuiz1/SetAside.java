package aptQuiz1;

import java.util.Arrays;
import java.util.HashSet;

public class SetAside {
    public String common(String[] list) {
    	String[] firstArray = list[0].split(" ");
    	HashSet<String> wordSet = new HashSet<String>(Arrays.asList(firstArray));
    	for (String s : list) {
    		String[] sArray = s.split(" ");
    		HashSet<String> newSet = new HashSet<String>(Arrays.asList(sArray));
    		wordSet.retainAll(newSet);
    	}
    	String[] arr = wordSet.toArray(new String[wordSet.size()]);
    	Arrays.sort(arr);
    	String str = "";
    	for (int i = 0; i<arr.length-1; i++) {
    		str+= (arr[i] + " ");
    	}
    	if (!(arr.length == 0)) {
    		str += arr[arr.length-1];
    	}
    	return str;
    }
}
