package SDA.Graphs.BFS;

import SDA.Graphs.Node;

import java.util.*;
// BREADTH FIRST SEARCH
public class BFS {

    private List<Node> out = new ArrayList<>();
    private Queue<Node> queue = new ArrayDeque<>();

    public void search(Node node){
          // Every node node is not visited at start, and later we add only unvisited
            node.setVisited(true); // set to visited
            out.add(node); // add to result

            for (Node n: node.getPaths()) { // add all unvisited(!) branching paths to queue
                if(!n.isVisited()){
                    queue.add(n);
                }
            }

            if(!queue.isEmpty()){
            search(queue.poll());
        }
    }

    public List<Node> getOut() {
        return out;
    }

    public Queue<Node> getQueue() {
        return queue;
    }
}
