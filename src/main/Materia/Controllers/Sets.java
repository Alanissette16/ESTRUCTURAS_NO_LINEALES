package main.Materia.Controllers;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Sets {

    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();
    }
    //Construir y mostrar un HashSet
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Pera Noruega");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Sandía");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Melón");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Piña");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Manzana"); //duplicado no se añadira
        System.out.println("HashSet: "+conjunto);
        //Eliminar un elemento
        conjunto.remove("Piña");
        System.out.println("HashSet despues de eliminar un elemento: "+conjunto);
        conjunto.remove("Manzana");
        conjunto.remove("Pera");
        System.out.println("HashSet despues de eliminar 2 elementos: "+conjunto);

        //Verificar si un elemento existe
        Boolean contienePiña = conjunto.contains("Piña");
        System.out.println("Hashset contiene Piña?: "+contienePiña);

        //Ordenar el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del HashSet: "+ tamaño);
    }
    //Construir y mostrar un LinkedHashSet
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Pera Noruega");
        conjunto.add("Sandía");
        conjunto.add("Melón");
        conjunto.add("Piña");
        conjunto.add("Manzana"); //duplicado no se añadira
        //Agregar elementos
        System.out.println("\nLinkedHashSet: "+conjunto);

    }
    //Construir y mostrar un TreeSet con orden natural
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Pera Noruega");
        conjunto.add("Sandía");
        conjunto.add("Melón");
        conjunto.add("Piña");
        conjunto.add("Manzana"); //duplicado no se añadira
        //Agregar elementos
        System.out.println("\nTreeSet: "+conjunto);

    }
    //Construir y mostrar un TreeSet con un comparador
    public void construirTreeSetConComparador(){
        //Comparador personalizado que ordena las cadenas en orden inverso
        Comparator<String> comparadorOrdenInverso = new Comparator<String>(){
            @Override
            public int compare (String s1, String s2){
                return s2.compareTo(s1);
            }
        };

        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Pera Noruega");
        conjunto.add("Sandía");
        conjunto.add("Melón");
        conjunto.add("Piña");
        conjunto.add("Manzana"); //duplicado no se añadira
        //Agregar elementos
        System.out.println("\nTreeSetComparador: "+conjunto);

    }
}
