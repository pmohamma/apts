package apt5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SortedFreqs {
	public int[] freqs(String[] data) {

        Arrays.sort(data);
        
		HashMap<String, strObject> dataMap = new HashMap<String, strObject>();
        for (String d : data) {
        	if (dataMap.containsKey(d)) {
        		dataMap.put(d, new strObject(d, dataMap.get(d).getFreq()+1));
        	}
        	else {
        		dataMap.put(d, new strObject(d, 1));
        	}
        }
        
        strObject[] cleanData = new strObject[dataMap.size()];
        int[] ret = new int[dataMap.size()];
        int index = 0;
        for (String d : dataMap.keySet()) {
        	cleanData[index] = dataMap.get(d);
        	index++;
        }
        
        HashSet<String> visited = new HashSet<String>();
        
        int loopCheck = ret.length;
        index = 0;
        for (int i = 0; i < loopCheck; i++) {
        	if (visited.contains(data[i])) {
        		loopCheck++;
        	}
        	else {
        		visited.add(data[i]);
        		ret[index] = dataMap.get(data[i]).getFreq();
        		index++;
        	}
        }
        return ret;
    }
    
    public class strObject {
    	private int myFreq;
    	private String myString;
    	
    	public strObject(String s, int freq) {
    		myString = s;
    		myFreq = freq;
    	}
    	
    	public int getFreq() {
    		return myFreq;
    	}
    	
    	public int freqComparator() {
    		return -myFreq;
    	}
    	
    	public String getString() {
    		return myString;
    	}
    }
}
