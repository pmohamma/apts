package apt4;

public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) {
        	return null;
        }
        else {
        	t.info = (1 + Math.max(height(t.left), height(t.right)));
        	rewire(t.left);
        	rewire(t.right);
        }
        return t;
    }
    
    public int height(TreeNode t) {
    	if (t == null) {
    		return 0;
    	}
    	else {
    		return 1 + Math.max(height(t.left), height(t.right));
    	}
    }
}
