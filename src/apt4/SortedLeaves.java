package apt4;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedLeaves {
    public String[] values(TreeNode tree) {
        if (tree == null) {
        	return null;
        }
        ArrayList<Character> characters = new ArrayList<Character>();
        if (tree.left != null) {
        	characters = addToArray(tree.left, characters);
        }
        if (tree.right != null) {
        	characters = addToArray(tree.right, characters);
        }
        int characSize = 0;
        for (Character ch : characters) {
        	if ((ch <= 90) && (ch>= 65)) {
        		characSize +=1;
        	}
        }
        String[] strings = new String[characSize];
        int temp = characSize;
        characSize = 0;
        for (int ch = 0; ch < characters.size(); ch++) {
        	if ((characters.get(ch) <= 90) && (characters.get(ch) >= 65)) {
        		strings[characSize] = characters.get(ch).toString();
        		characSize+=1;
        	}
        }
        if (temp == 0) {
        	return null;
        }
        Arrays.sort(strings);
        return strings;
    }
    
    public ArrayList<Character> addToArray(TreeNode tree, ArrayList<Character> lst) {
    	char data = (char) tree.info;
    	if ((tree.left == null) && (tree.right == null)) {
    		lst.add(data);
    	}
    	if (tree.left != null) {
    		lst = addToArray(tree.left, lst);
    	}
    	if (tree.right != null) {
    		lst = addToArray(tree.right, lst);
    	}
    	return lst;
    }
}