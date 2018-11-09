package aptQuiz1;

import java.util.ArrayList;
import java.util.HashMap;

public class DonorStats {
    public String[] calculate(String[] donations) {
    	HashMap<String, Integer[]> data = new HashMap<String, Integer[]>();
    	for (String w : donations) {
    		int loc = w.indexOf(":");
    		String name = w.substring(0, loc);
    		if (!data.containsKey(name)) {
    			Integer[] arr = {0, 0};
    			data.put(name, arr);
    		}
    		for (String f : w.substring(loc+1, w.length()).split(",")) {
    			Integer k = Integer.parseInt(f);
        		Integer[] arr = {(data.get(name)[0])+k, (data.get(name)[1])+1};
        		data.put(name, arr);
    		}
    		
    	}
    	ArrayList<String> retList = new ArrayList<String>();
    	for (String n : data.keySet()) {
    		Integer total = data.get(n)[1];
    		Integer amount = data.get(n)[0];
    		String s = String.format("%s:%d:%d",n,total,amount);
    		retList.add(s);
    	}
    	
    	String[] ret = retList.toArray(new String[retList.size()]);
        
    	return ret;
    }
}
