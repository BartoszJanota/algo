import java.util.ArrayList;
import java.util.List;

/**
 * Created by bartoszjanota-prv on 02/03/16.
 */
public class TreeNode {
    int id;
    TreeNode parent;

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    List<TreeNode> children;

    public TreeNode(TreeNode parent, int i) {
        this.parent = parent;
        this.id = i;
        this.children = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
}
