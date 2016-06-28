import apple.laf.JRSUIUtils;

/**
 * Created by bartoszjanota-prv on 02/03/16.
 */
public class TreeNodeAlgos {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(null, 1);
        TreeNode left = new TreeNode(root,2);
        TreeNode right = new TreeNode(root,3);
        TreeNode leftLeft = new TreeNode(left, 4);
        TreeNode rightLeft = new TreeNode(right, 5);
        TreeNode rightLeftLeft = new TreeNode(rightLeft, 6);
        TreeNode rightRight = new TreeNode(right, 7);

        System.out.println(findCommonAncestor(leftLeft, rightLeftLeft).getId());
        System.out.println(findCommonAncestor(rightRight, rightLeftLeft).getId());
    }

    static TreeNode findCommonAncestor(TreeNode n1, TreeNode n2){
        if (n1 == null || n2 == null) return null;
        int n1Depth = countDepth(n1);
        int n2Depth = countDepth(n2);
        int diff = n1Depth - n2Depth;
        if (diff < 0) {
            n2 = goUp(n2, -diff);
        } else {
            n1 = goUp(n1, diff);
        }

        while(n1 != n2){
            n1  = n1.getParent();
            n2 = n2.getParent();
        }
        return n1;
    }

    private static int countDepth(TreeNode node) {
        int depth = 0;
        while (node.getParent() != null){
            depth++;
            node = node.getParent();
        }
        return depth;
    }

    static TreeNode goUp(TreeNode node, int diff){
        while(diff > 0){
            diff--;
            node = node.getParent();
        }
        return node;
    }
}
