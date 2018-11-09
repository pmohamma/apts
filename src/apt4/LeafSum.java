package apt4;

public class LeafSum {
    public int sum(TreeNode t) {
    	int ret = 0;
    	if (t == null) {
    		return ret;
    	}
    	if ((t.left == null) && (t.right == null)) {
    		return t.info;
    	}
    	if (t.left != null) {
    		ret += sum(t.left);
    	}
    	if (t.right != null) {
    		ret += sum(t.right);
    	}
        return ret;
    }
}