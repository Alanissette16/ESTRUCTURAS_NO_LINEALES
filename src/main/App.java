package main;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;

/*
 *                1 
 *          2          3
 *       4     5         6 
 *   7        8  
 */

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario arbolBinario = new ArbolBinario();
        Node noderaiz = new Node(1);
        //Instanciamos los hijos del 1
        noderaiz.setLeft(new Node(2));
        noderaiz.setRight(new Node(3));
         //Instanciamos los hijos del 2
        noderaiz.getLeft().setLeft(new Node(4));
        noderaiz.getLeft().setRight(new Node(5));
        //Instanciamos el hijo del 4
        noderaiz.getLeft().getLeft().setLeft(new Node(7));
        //Instanciamos el hijo del 5
        noderaiz.getLeft().getRight().setLeft(new Node(8));
        //Instanciamos el hijo del 3
        noderaiz.getRight().setRight(new Node(6));

        System.out.println("Preorder Loop");
        arbolBinario.preOrderRecursivo(noderaiz);
        System.out.println();
        System.out.println("Preorder Recursivo");
        arbolBinario.preOrderRecursivo(noderaiz);
        System.out.println();
        System.out.println("Postorder Loop");
        arbolBinario.postOrderLoop(noderaiz);
        System.out.println();
        System.out.println("Postorder Recursivo");
        arbolBinario.postOrderRecursivo(noderaiz);
        System.out.println();
        System.out.println("INorder Recursivo");
        arbolBinario.InOrderRecursivo(noderaiz);

    }
}
