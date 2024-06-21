package main.Ejercicio_03_listLeves;
import main.Materia.Models.Node;
import java.util.ArrayList;
import java.util.List;

public class ListLevels {
    public List<List<Node>> listnivelesList(Node root) {
        List<List<Node>> nivelesList = new ArrayList<>();
        listnivelesListHelper(root, nivelesList, 0);
        return nivelesList;
    }
        
    private void listnivelesListHelper(Node node, List<List<Node>> nivelesList, int depth) {
        if (node == null) {
            return;
        }
        // Si el nivel actual aún no tiene una lista asociada, se crea una nueva
        if (depth == nivelesList.size()) {
            nivelesList.add(new ArrayList<>());
        }
        // Agrega el nodo actual a la lista correspondiente al nivel actual
        nivelesList.get(depth).add(node);

        // Llama recursivamente para los subárboles izquierdo y derecho
        listnivelesListHelper(node.getLeft(), nivelesList, depth + 1);
        listnivelesListHelper(node.getRight(), nivelesList, depth + 1);
    }
}