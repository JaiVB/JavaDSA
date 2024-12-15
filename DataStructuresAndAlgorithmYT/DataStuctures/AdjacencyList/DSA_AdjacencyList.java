package DataStructuresAndAlgorithmYT.DataStuctures.AdjacencyList;

public class DSA_AdjacencyList {



    /*
     * Adjacency List
     * - An array/arraylist of linkedLists
     * - Each LinledList has a unique node at the head.
     * - All adjacent neighbors to that node are added to that node's linkedList
     * 
     *          Runtime Complexity to check an Edge O(v) aka O(n)
     *          Space Complexity: O(v + e)  e = # of edge's
     *                                      v = # of vertices
     * 
     * 
     *          
     *       ArrayList  (UP/DPWN) 
     *       LinkedList (LEFT/RIGHT)
     *          [A] - > [B] - > 
     *          [B] - > [C] - > [E] - >
     *          [C] - > [D] - > [E] - >
     *          [D] - >
     *          [E] - > [A] - > [C] - >
     * 
     */
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}
