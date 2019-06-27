package SDA.Graphs.linkedList;

public class OneWayTraversableList {

    public boolean isLooped(Node node){
        Node fastNode = node;
        Node slowNode = node;

        while (slowNode.getNext() != null && fastNode.getNext() != null){

            Node nextFast = fastNode.getNext().getNext();
            Node nextSlow = slowNode.getNext();
            if(nextFast == null)return false;

                fastNode = nextFast;
                slowNode = nextSlow;
                if(fastNode.equals(slowNode)) return true;
        }
        return false;
    }
}
