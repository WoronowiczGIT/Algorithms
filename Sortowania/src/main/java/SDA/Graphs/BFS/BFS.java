package SDA.Graphs.BFS;

import java.util.*;
// BREADTH FIRST SEARCH
public class BFS {

    List<Node> out = new ArrayList<>();
    Queue<Node> queue = new ArrayDeque<>();

    public void search(Node node){
          // Every node node is not visited at start, and later we add only unvisited
            node.visited = true; // set to visited
            out.add(node); // add to result

            for (Node n: node.paths) { // add all unvisited(!) branching paths to queue
                if(!n.visited){
                    queue.add(n);
                }
            }

            if(!queue.isEmpty()){
            search(queue.poll());
        }
    }
}
