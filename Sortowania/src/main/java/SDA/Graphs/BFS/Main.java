package SDA.Graphs.BFS;

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

        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");

        A.getPaths().add(B);
        A.getPaths().add(C);

            B.getPaths().add(B);
            B.getPaths().add(E);
            B.getPaths().add(G);
                G.getPaths().add(H);

            C.getPaths().add(D);
            C.getPaths().add(F);

                D.getPaths().add(A);

        BFS bfs = new BFS();
        bfs.search(D);
        for (Node node: bfs.getOut()
             ) {
            System.out.print(node.getName()+" ");
        }
    }
}
