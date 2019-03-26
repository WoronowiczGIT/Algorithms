package SDA.Utilities;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Utilities {

    public void printArray(Integer[] array) {
        System.out.println();
        for (Integer x : array) {
            System.out.print(x + " ");
        }
    }

    public Integer[] generateRandomArray() {
        int length = new Random().nextInt(10) + 1;
        Integer[] resault = new Integer[length];
        for (int i = 0; i < length; i++) {
            resault[i] = new Random().nextInt(10);
        }
        return resault;
    }

    public int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public List<Integer> randomList() {

        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(generateRandom());
        }
        return lista;
    }

    // tab to List
    public List<Integer> tabToList(Integer[] tab) {
        List<Integer> resault = new LinkedList<>();
        for (int a : tab
        ) {
            resault.add(a);
        }
        return resault;
    }

    public List<Integer>[] evenOdd(List<Integer> input) {

        List<Integer> even = new LinkedList<>();
        List<Integer> odd = new LinkedList<>();
        List<Integer>[] resault = new List[]{even, odd};

        while (even.size() < 10 || odd.size() < 10) {
            int a = generateRandom();
            if (a % 2 == 0 && even.size() < 10) {
                even.add(a);
            }
            if (a % 2 != 0 && odd.size() < 10) {
                odd.add(a);
            }
        }
        return resault;
    }
}
