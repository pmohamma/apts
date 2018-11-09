package practiceApts;

public class InOrderTraversal {
	public static void Main(String[] args) {
		TreeNode root = new TreeNode(7, new TreeNode(5, new TreeNode(3, null, new TreeNode(4, null, null)), null), new TreeNode(9, new TreeNode(8, null, null), new TreeNode(10, null, null)));
		
		int h = traverse(root);
		
		System.out.println("\n\n\n\n" + h);
	}
	
	public static int traverse(TreeNode t) {
		if (t == null) {
			return 0;
		}
		if (t.left != null) {
			traverse(t.left);
		}
		else if (t.left == null) {
			System.out.println(t.info);
		}
		if (t.right != null) {
			traverse(t.right);
		}	
	return 0;
	}
}
