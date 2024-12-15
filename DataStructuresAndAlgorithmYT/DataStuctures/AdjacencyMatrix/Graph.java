package DataStructuresAndAlgorithmYT.DataStuctures.AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {

//----------------EXTRA NOT NEEDED FOR MATRIX------------------------//
ArrayList<Node> nodes; //Just to look Nice
//----------------EXTRA NOT NEEDED FOR MATRIX------------------------//

    int[][] matrix;

    Graph(int size){ // size = amount of nodes we will have

        nodes = new ArrayList<>();

        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    // src = Source, dst = Destination
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1; // by making this 1
                              // this shows there is an Edge

    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1) {
            return true;
        }
        else return false; 
    }

    public void print(){

        //TO MAKE LOOK NICE//
        System.out.print("  ");

        for(Node node: nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        //TO MAKE LOOK NICE//





        for(int i = 0; i < matrix.length; i++) { // iterates ROWS of Matrix

            //TO MAKE LOOK NICE//
            System.out.print(nodes.get(i).data + " ");
            //TO MAKE LOOK NICE//


            for(int j = 0; j < matrix[i].length; j++){ // iterates COLUMNS of Matrix
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
