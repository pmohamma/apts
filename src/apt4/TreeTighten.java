package apt4;

public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
    	if (t == null) return null;
        if ((t.right == null) && (t.left == null)) {
        	return t;
        }
        if ((t.right == null) && !(t.left == null)) {
        	t = tighten(t.left);
        	return (t);
        }
        if (!(t.right == null) && (t.left == null)){
        	t = tighten(t.right);
        	return (t);
        }
        t.left = tighten(t.left);
        t.right = tighten(t.right);
        return t;
    }
}