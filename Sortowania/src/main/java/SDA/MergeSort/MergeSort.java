package SDA.MergeSort;

public class MergeSort {

    public Integer[] sort(Integer[] array) {
        //we assume a single digit array as sorted
        if (array.length == 1) {
            return array;
        }
        // initialize left nad right array
        int pivot = array.length / 2;
        Integer[] left = new Integer[pivot];
        Integer[] right = new Integer[array.length - pivot];
        // sort input array into 2 array
        for (int i = 0; i < array.length; i++) {
            if (i < pivot) {
                left[i] = array[i];
            } else right[i - pivot] = array[i];
        }
        // call recursive both sides
        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public Integer[] merge(Integer[] left, Integer[] right) {
        Integer[] result = new Integer[right.length + left.length];
        int leftPoint, rightPoint, resultPoint;
        leftPoint = rightPoint = resultPoint = 0;

        // iterate untill result pointer reaches reaches last value
        while (resultPoint < result.length) {

            //checking if we have at least 2 elements to compare
            if (leftPoint < left.length && rightPoint < right.length) {
                //if the left one is smaller we put him on result and increment pointers
                if (left[leftPoint] < right[rightPoint]) {
                    result[resultPoint++] = left[leftPoint++];
                    // if right is smaller we do accordingly
                } else {
                    result[resultPoint++] = right[rightPoint++];
                }
                // we check for the last element without a pair

                //if its in the left array:
            } else if (leftPoint < left.length) {
                result[resultPoint++] = left[leftPoint++];
                // if its in the right array:
            } else if (rightPoint < right.length) {
                result[resultPoint++] = right[rightPoint++];
            }
        }
        return result;
    }
}
