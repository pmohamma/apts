package apt2;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
    	int[] hcounts = new int[256];
    	int ret = 0;
    	for (String s : headlines) {
    		for (char ch : s.toLowerCase().toCharArray()) {
    			hcounts[ch] = hcounts[ch] + 1;
    		}
    	}
    	for (String s: messages) {
    		int[] mcounts = new int[256];
    		for (char ch : s.toLowerCase().toCharArray()) {
    			mcounts[ch] = mcounts[ch]+1;
    		}
    		boolean allGood = true;
    		for (char ch : s.toLowerCase().toCharArray()) {
    			if ((mcounts[ch] > hcounts[ch]) && (ch != ' ')) {
    				allGood = false;
    			}
    		}
    		if (allGood) ret +=1;
    	}
        return ret;
    }
 }
