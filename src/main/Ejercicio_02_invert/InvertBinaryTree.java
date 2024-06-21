package main.Ejercicio_02_invert;
import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root){
        //en caso de que sea nulo retorna la raiz
        if(root == null){
           return null;
       }
       Node left = invertTree(root.left);
       Node right = invertTree(root.right);
       root.left = right;
       root.right = left;

       return root;
    }
}
