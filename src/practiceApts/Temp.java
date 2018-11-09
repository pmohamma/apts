package practiceApts;

public class Temp {
	public int oneChildCount (TreeNode root) {
		if (root.left == null && root.right == null) {
			return 0;
		}
		if (root.left == null) {
			return 1 + oneChildCount(root.right);
		}
		if (root.right == null) {
			return 1 + oneChildCount(root.left);
		}
		return oneChildCount(root.left) + oneChildCount(root.right);
	}
	
	public static void Main(String[] args) throws Exception {
		System.out.println("hello");
	}
}