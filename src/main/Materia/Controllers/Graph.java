package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;
import main.Materia.Models.*;


public class Graph {
    List<NodeGraph> nodes;

    //Constructor
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    //Método para añadir un nodo
    public NodeGraph addNode(int value){
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;

    }
    //Método para añadir una arista
    public void addEdge(NodeGraph src,NodeGraph dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    //Método para imprimir el grafo
    public void printGraph(){
        for(NodeGraph node : nodes){
            System.out.print("\n Vertex "+ node.getValue()+":");
            for(NodeGraph neighbor : node.getNeighbors()){
                System.out.print(" -> "+neighbor.getValue());
            }
            System.out.println();
        }
    }

    public void getDFS(NodeGraph startNode){

    }
    private void getDFSUtil(NodeGraph node, boolean[] visited){
        return;
    }
    public void getBFS(NodeGraph startNode){

    }
    public int[][] getAdjancyMatrix(){
        return;
    }
    public void printAdjacencyMatrix(){

    }

    
}
