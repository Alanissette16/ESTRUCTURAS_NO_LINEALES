package main;
import main.Materia.Controllers.AVLTree;
//import main.Materia.Controllers.ArbolBinario;
//import main.Materia.Models.Node;
import main.Materia.Controllers.Graph;
import main.Materia.Models.NodeGraph;

/*
 *                1 
 *          2          3
 *       4     5         6 
 *   7        8  
 */

public class App {
    public static void main(String[] args) throws Exception {
        // ArbolBinario arbolBinario = new ArbolBinario();
        // Node noderaiz = new Node(1);
        // //Instanciamos los hijos del 1
        // noderaiz.setLeft(new Node(2));
        // noderaiz.setRight(new Node(3));
        //  //Instanciamos los hijos del 2
        // noderaiz.getLeft().setLeft(new Node(4));
        // noderaiz.getLeft().setRight(new Node(5));
        // //Instanciamos el hijo del 4
        // noderaiz.getLeft().getLeft().setLeft(new Node(7));
        // //Instanciamos el hijo del 5
        // noderaiz.getLeft().getRight().setLeft(new Node(8));
        // //Instanciamos el hijo del 3
        // noderaiz.getRight().setRight(new Node(6));

        // System.out.println("Preorder Loop");
        // arbolBinario.preOrderRecursivo(noderaiz);
        // System.out.println();
        // System.out.println("Preorder Recursivo");
        // arbolBinario.preOrderRecursivo(noderaiz);
        // System.out.println();
        // System.out.println("Postorder Loop");
        // arbolBinario.postOrderLoop(noderaiz);
        // System.out.println();
        // System.out.println("Postorder Recursivo");
        // arbolBinario.postOrderRecursivo(noderaiz);
        // System.out.println();
        // System.out.println("INorder Recursivo");
        // arbolBinario.InOrderRecursivo(noderaiz);

        // AVLTree tree = new AVLTree();

        // int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        // for (int value : values) {
        //     tree.insert(value);
        // }


        runGraph();
        
    }

    private static void runGraph() {
        Graph graph = new Graph();

        //Agregar nodos
        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);
        
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);

        //Imprimir el Grafo
        graph.printGraph();
        
    }
}
