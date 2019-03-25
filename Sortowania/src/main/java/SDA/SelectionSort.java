package SDA;

public class SelectionSort implements Cloneable {

    public Integer[] selSortT(Integer[] input) {

        Integer[] resault = input.clone();

        for (int i = 0; i < resault.length; i++) {

            int localMIN = resault[i];
            int indexMIN = i;

            for (int j = i + 1; j < resault.length; j++) {
                if (resault[j] < localMIN) {
                    localMIN = resault[j];
                    indexMIN = j;
                }
            }
            resault[indexMIN] = resault[i];
            resault[i] = localMIN;

            showSteps(resault);
        }
        return resault;
    }

    private void showSteps(Integer[] input){
        for (Integer x: input
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
