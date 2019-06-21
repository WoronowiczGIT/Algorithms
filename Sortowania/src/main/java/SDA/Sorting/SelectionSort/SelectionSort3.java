package SDA.Sorting.SelectionSort;

import java.util.List;

public class SelectionSort3 {

    public static Integer[] sortByPicking2(List<Integer> list) {
        Integer[] values = new Integer[list.size()];
        list.toArray(values);

        for (int i = 0; i < values.length; i++) {
            int min = values[i];
            int minIndex = i;
            // znajdz najmniejsza i zapamietaj index
            for (int j = i; j < values.length; j++) {
                if (values[j] <= min) {
                    min = values[j];
                    minIndex = j;
                }
            }
            int temp = values[i];
            values[i] = min;
            values[minIndex] = temp;
        }
        return values;
    }


}
