package SDA.Graphs.BFS;

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

        A.paths.add(B);
        A.paths.add(C);

            B.paths.add(B);
            B.paths.add(E);
            B.paths.add(G);
                G.paths.add(H);

            C.paths.add(D);
            C.paths.add(F);

                D.paths.add(A);

        BFS bfs = new BFS();
        bfs.search(D);
        for (Node node: bfs.out
             ) {
            System.out.print(node.name+" ");
        }
    }
}
