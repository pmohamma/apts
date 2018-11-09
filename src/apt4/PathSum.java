package apt4;

public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if (tree.left == null && tree.right == null) {
        	if (target-tree.info == 0) return 1;
        	else return 0;
        }
        if (tree.left == null) {
        	return (hasPath(target-tree.info, tree.right));
        }
        if (tree.right == null) {
        	return (hasPath(target-tree.info, tree.left));
        }
        return (Math.max(hasPath(target-tree.info, tree.left), hasPath(target-tree.info, tree.right)));
    }
}