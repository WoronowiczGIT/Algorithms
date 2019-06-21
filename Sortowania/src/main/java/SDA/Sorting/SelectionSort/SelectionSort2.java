package SDA.Sorting.SelectionSort;

import java.util.LinkedList;
import java.util.List;

public class SelectionSort2 {

    //SUPER WAZNE - NIE WYKONUJEMY NA LISTACH OPERACJI Z UZYCIEM OPERATOROW !!! NIGDY !!!
    public List<Integer> selectionSort (List<Integer> input) {
        List<Integer> lista = new LinkedList<>();
        lista.addAll(input);

        int min;
        int index = 0;
        for (int i = 0; i < input.size(); i++) {
            min = lista.get(i);
            for (int j = i; j < input.size(); j++) {
                if (lista.get(j) < min) {
                    min = lista.get(j);
                    index = j;
                }
            }
            lista.set(index, lista.get(i));
            lista.set(i, min);
        }
        return lista;
    }
}
