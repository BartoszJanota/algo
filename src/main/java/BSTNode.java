/**
 * Created by bartoszjanota-prv on 02/03/16.
 */
public class BSTNode {
    int id;
    BSTNode left;
    BSTNode right;

    public BSTNode(int id) {
        this.id = id;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode() {
    }

    public BSTNode(BSTNode right, BSTNode left) {
        this.right = right;
        this.left = left;
    }

    public int getId() {
        return id;
    }
}
