package apt4;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public String[] paths(TreeNode t) {
    	if (t == null) return new String[0];
    	String rootInfo = "" + t.info + "->";
    	ArrayList<String> listStrings = new ArrayList<String>();
    	if ((t.left == null) && (t.right == null)) {
    		listStrings.add(""+t.info);
    	}
    	if (t.left != null) {
    		listStrings = createPaths(t.left, listStrings, rootInfo);
    	}
    	if (t.right != null) {
    		listStrings = createPaths(t.right, listStrings, rootInfo);
    	}
    	
    	String[] strings = new String[listStrings.size()];
    	for (int i = 0; i < listStrings.size(); i++) {
    		strings[i] = listStrings.get(i);
    	}
    	
    	Arrays.sort(strings);
        return strings;
    }
    
    public ArrayList<String> createPaths(TreeNode t, ArrayList<String> lst, String curr) {
    	if ((t.right == null) && (t.left == null)) {
    		curr += "" + t.info;
    		lst.add(curr);
    		return lst;
    	}
    	curr += ("" + t.info + "->");
    	if (t.left != null) {
    		lst = createPaths(t.left, lst, curr);
    	}
    	if (t.right != null) {
    		lst = createPaths(t.right, lst, curr);
    	}
    	return lst;
    }
}