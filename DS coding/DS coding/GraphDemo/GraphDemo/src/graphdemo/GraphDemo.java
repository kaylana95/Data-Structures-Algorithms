/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphdemo;

/**
 *
 * @author Anthony
 */
public class GraphDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyGraph theGraph = new MyGraph();
        theGraph.addVertex('E'); //0 (start for dfs)
        theGraph.addVertex('B'); //1
        theGraph.addEdge(0, 1); //AB

        theGraph.addVertex('C'); //2
        theGraph.addEdge(1, 2); //BC

        theGraph.addVertex('D'); //3
        theGraph.addEdge(0, 3); //AD

        theGraph.addVertex('A'); //4
        theGraph.addEdge(3, 4); //DE

        System.out.print("Visits: ");
        theGraph.dfs(); //depth-first search
        System.out.println();

    }

}
