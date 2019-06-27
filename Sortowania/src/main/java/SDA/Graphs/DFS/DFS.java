package SDA.Graphs.DFS;

import SDA.Graphs.Node;

import java.util.*;

public class DFS {

   private List<Node> out = new ArrayList<>();


   public void search(Node node){
       if(node.isVisited())return;

       node.setVisited(true);
       out.add(node);
       Iterator<Node> iterator = node.getPaths().iterator();

       while (iterator.hasNext()){
           search(iterator.next());
       }
   }

    public List<Node> getOut() {
        return out;
    }

}
