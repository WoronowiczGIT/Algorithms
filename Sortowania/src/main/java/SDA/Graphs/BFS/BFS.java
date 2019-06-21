package SDA.Graphs.BFS;

import java.util.*;

public class BFS {

    List<Node> out = new ArrayList<>();
    Queue<Node> queue = new ArrayDeque<>();

    public void search(Node node){
        if(!node.visited){
            node.visited = true;
            out.add(node);

            for (Node n: node.paths) {
                if(!n.visited){
                    queue.add(n);
                }
            }
        }

        if(!queue.isEmpty()){
            search(queue.poll());
        }
    }
}
