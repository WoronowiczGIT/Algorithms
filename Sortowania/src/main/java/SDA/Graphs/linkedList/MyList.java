package SDA.Graphs.linkedList;

public class MyList {


    private Node head;
    private Node current;

    public void addToList(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(node);
        }
    }

    public Node getNextNode() {
        if (current == null) {
            current = head;
            return head;
        }
        current = current.getNext();
        return current;
    }

}
