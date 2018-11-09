package practiceApts;

public class Recharge {
	public TreeNode recharge(TreeNode t) {
		return helper(t, 1);
	}
	
	public TreeNode helper(TreeNode t, int level) {
		if (t == null) return null;
		TreeNode x = new TreeNode(level, null, null);
		x.right = helper(t.right, level+1);
		x.left = helper(t.left, level+1);
		return x;
	}
	
	TreeNode root = new TreeNode(7, new TreeNode(5, new TreeNode(3, null, new TreeNode(4, null, null)), null), new TreeNode(9, new TreeNode(8, null, null), new TreeNode(10, null, null)));
	
}
