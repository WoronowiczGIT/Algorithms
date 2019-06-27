package SDA.Graphs;

import java.util.HashSet;
import java.util.Set;

public class Node {
     private String name;
     private boolean visited;
     private Set<Node> paths = new HashSet<>();

     public Node(String name){
         this.name = name;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public boolean isVisited() {
          return visited;
     }

     public void setVisited(boolean visited) {
          this.visited = visited;
     }

     public Set<Node> getPaths() {
          return paths;
     }

     public void setPaths(Set<Node> paths) {
          this.paths = paths;
     }
}
