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

        A.paths.add(B);
        A.paths.add(C);

        B.paths.add(B);
        C.paths.add(D);
        D.paths.add(A);

        BFS bfs = new BFS();
        bfs.search(A);
        for (Node node: bfs.out
             ) {
            System.out.println(node.name);
        }
    }
}
