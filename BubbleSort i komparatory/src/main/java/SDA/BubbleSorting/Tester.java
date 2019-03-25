package SDA.BubbleSorting;

public class Tester {
    public static void main(String[] args) {
        String[] a = {"a","z","d","c","h"};
        // Trzeba utworzyć obiekt który implementuje Interface sortowania
        BubbleSortString stringSorter = new BubbleSortString();
        stringSorter.sortByBubbles(a);
        for (String s: a
             ) {
            System.out.print(s+" ");
        }
    }


}
