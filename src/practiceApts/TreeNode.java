package practiceApts;

public class TreeNode {
    int info;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        info = x;
    }
    TreeNode(int x, TreeNode lNode, TreeNode rNode){
        info = x;
        left = lNode;
        right = rNode;
    }
    
    public String toString() {
    	String ret = "";
    	if (left == null && right == null) {
    		ret = "" + info + ", " + "x" + ", " + "x, ";
    	}
    	else if (left == null) {
    		ret = "" + info + ", " + "x" + ", " + right.toString() +", ";
    	}
    	else if (right == null) {
    		ret = "" + info + ", " + left.toString() + ", " + "x, ";
    	}
    	else{
    		ret = "" + info + ", " + left.toString() + ", " + right.toString() + ", ";
    	}
    	return ret;
    }
}
