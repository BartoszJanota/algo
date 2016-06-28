import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by bartoszjanota-prv on 02/03/16.
 */
public class BST {
    public static void main(String[] args) {
        BSTNode root = new BSTNode(1);
        BSTNode left = new BSTNode(2);
        BSTNode right = new BSTNode(3);
        root.setLeft(left);
        root.setRight(right);
        BSTNode leftLeft = new BSTNode(4);
        left.setLeft(leftLeft);
        BSTNode leftLeftRight = new BSTNode(5);
        leftLeft.setRight(leftLeftRight);
        BSTNode rightLeft = new BSTNode(6);
        right.setLeft(rightLeft);
        BSTNode rightRight = new BSTNode(7);
        right.setRight(rightRight);
        BSTNode righRightLeft = new BSTNode(8);
        rightRight.setLeft(righRightLeft);
        //rightRight.setRight(leftLeft);
        BSTNode leftRight = new BSTNode(9);
        left.setRight(leftRight);


        System.out.println(checkIfTreeIsBalanced(left, right));
        System.out.println(checkIfTreeIsBalanced(root, right));
        System.out.println(checkIfTreeIsBalanced(root, leftLeft));

        System.out.println(isThereARouteBetweenTwoNodes(new HashSet<BSTNode>(), root));
        bFS(root);

        System.out.println("Making BST");
        int[] array = {1, 2, 4, 6, 7, 8, 9};
        BSTNode newRoot = makeBST(array, 0, array.length - 1);
        bFS(newRoot);
        System.out.println("finishing");
    }

    private static boolean checkIfTreeIsBalanced(BSTNode left, BSTNode right) {
        int leftDepth = getTreeDepth(left);
        int rightDepth = getTreeDepth(right);
        System.out.println("left: " + leftDepth + ", right: " + rightDepth);
        return Math.abs(leftDepth - rightDepth) <= 1;
    }

    static int getTreeDepth(BSTNode root){
        if (root == null){
            return 0;
        } else if (isLeaf(root)) {
            return 1;
        } else {
            return max(getTreeDepth(root.getLeft()) + 1, getTreeDepth(root.getRight()) + 1);
        }
    }

    static boolean isLeaf(BSTNode root){
        return root.getLeft() == null && root.getRight() == null;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }

    static boolean isThereARouteBetweenTwoNodes(Set<BSTNode> visited, BSTNode root){
        if (root == null){
            return false;
        } else {
            System.out.println(root.getId());
            if (visited.contains(root)){
                return true;
            } else {
                visited.add(root);
                return isThereARouteBetweenTwoNodes(visited, root.getRight()) ||  isThereARouteBetweenTwoNodes(visited, root.getLeft());
            }
        }
    }

    static void bFS(BSTNode root){
        if (root == null) return;
        LinkedList<BSTNode> toBeVisited = new LinkedList<>();
        toBeVisited.add(root);
        while (!toBeVisited.isEmpty()){
            BSTNode curr = toBeVisited.removeFirst();
            if (curr != null){
                System.out.println(curr.getId());
                toBeVisited.add(curr.getLeft());
                toBeVisited.add(curr.getRight());
            }
        }
    }

    static BSTNode makeBST(int [] array, int left, int right){
        if (right < left) return null;
        int half = (left + right) / 2;
        BSTNode root = new BSTNode(array[half]);
            root.setLeft(makeBST(array, left, half - 1));
            root.setRight(makeBST(array, half + 1, right));
        return root;
    }
}
