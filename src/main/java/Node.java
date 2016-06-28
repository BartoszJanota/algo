/**
 * Created by bartoszjanota-prv on 28/02/16.
 */
public class Node {
    Node next = null;
    int val;

    public Node(int val){
        this.val = val;
    }

    public void appendToTail(int val){
        Node newNode = new Node(val);
        Node nextNode = this;
        while(nextNode.next != null){
            nextNode = nextNode.next;
        }
        nextNode.next = newNode;
    }

    public boolean hasNext() {
        return this.next != null;

    }

    public void appendToTail(Node node) {
        Node nextNode = this;
        while(nextNode.next != null){
            nextNode = nextNode.next;
        }
        nextNode.next = node;
    }
}
