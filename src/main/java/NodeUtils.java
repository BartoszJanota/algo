import java.util.HashSet;
import java.util.Set;

/**
 * Created by bartoszjanota-prv on 28/02/16.
 */
public class NodeUtils {
    static Node removeNode(Node head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        Node node = head;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                return head;
            }
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        printList(head);

        head = removeNode(head, 3);
        printList(head);

        head.appendToTail(5);
        head.appendToTail(6);
        head = removeNode(head,1);
        printList(head);
        head = reverseList(head);
        printList(head);

        Node node5 = new Node(5);
        Node node4 = new Node(4);

        head.appendToTail(node5);
        head.appendToTail(node4);
        head.appendToTail(3);
        printList(head);

        removeDuplicates(head);
        printList(head);
    }

    private static void printList(Node head) {
        while(head.hasNext()){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head.val);
    }

    static Node reverseList(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node nextNode = head;
        head = null;
        while(nextNode != null){
            Node tmp = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = tmp;
        }

        return head;
    }

    static void removeDuplicates(Node head){
        if (head == null || !head.hasNext()) {
            return;
        }
        Set nodes = new HashSet();
        Node prevNode = null;
        while(head != null){
            if (nodes.contains(head.val)){
                prevNode.next = head.next;
            } else {
                nodes.add(head.val);
                prevNode = head;
            }
            head = head.next;
        }
    }
}
