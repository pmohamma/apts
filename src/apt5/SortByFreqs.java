package apt5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SortByFreqs {
    public String[] sort(String[] data) {
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
        String[] ret = new String[dataMap.size()];
        int index = 0;
        for (String d : dataMap.keySet()) {
        	cleanData[index] = dataMap.get(d);
        	index++;
        }
        
        Comparator<strObject> comp = Comparator.comparing(strObject::freqComparator);
        comp = comp.thenComparing(strObject::getString);
        Arrays.sort(cleanData, comp);
        
        for (int i = 0; i < ret.length; i++) {
        	ret[i] = cleanData[i].getString();
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
