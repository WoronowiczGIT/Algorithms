package SDA.Graphs.DFS;

import SDA.Graphs.Node;

public class Main {
    /*  A B C D
     * A - X X -
     * B - X - -
     * C - - - X
     * D X - - -
     * */
    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");

        A.getPaths().add(B);
        A.getPaths().add(C);

        B.getPaths().add(B);

        C.getPaths().add(D);

        D.getPaths().add(A);

        DFS deepFirstSearch = new DFS();

        deepFirstSearch.search(C);

        for (Node node: deepFirstSearch.getOut()
        ) {
            System.out.print(node.getName()+" ");
        }
    }
}
