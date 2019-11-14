package exercicioint;

import sorter.SortedList;


public class ExercicioInt {

    public static void main(String[] args) {
        SortedList lista = new SortedList(10);
        
        
        Produto borracha = new Produto(182, "Borracha azul");
        lista.add(borracha);
        Produto canetaAzul = new Produto(1, "Cor Azul");
        lista.add(canetaAzul);
       
        
        lista.printList();
        
        
    }
    
}
