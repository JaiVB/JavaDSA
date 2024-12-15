package DataStructuresAndAlgorithmYT.DataStuctures.AdjacencyMatrix;

public class DSA_AdjacencyMatrix { 
    /*
     * Adjacency Matrix
     * - 2D array to store 1's/0's to represent edges
     *         # of rows   = # of unique nodes
     *         # of colums = # of unique edges
     * 
     * Edge Check TIME:
     * 
     * Runtime Complexity = O(1)
     * Space Complexity   = O(v^2)  THIS IS THE SAME AS O(n^2)
     */

    public static void main(String[] args) {
     
        Graph graph = new Graph(5);

     graph.addNode(new Node('A'));
     graph.addNode(new Node('B'));
     graph.addNode(new Node('C'));
     graph.addNode(new Node('D'));
     graph.addNode(new Node('E'));

     graph.addEdge(0, 1);
     graph.addEdge(1, 2);
     graph.addEdge(2, 3);
     graph.addEdge(2, 4);
     graph.addEdge(4, 0);
     graph.addEdge(4, 2);

     graph.print();

     System.out.println(graph.checkEdge(3, 2));
    }
     
}
