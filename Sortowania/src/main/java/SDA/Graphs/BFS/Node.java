package SDA.Graphs.BFS;

import java.util.HashSet;
import java.util.Set;

public class Node {
     String name;
     boolean visited;
     Set<Node> paths = new HashSet<>();

     Node(String name){
         this.name = name;
     }
}
