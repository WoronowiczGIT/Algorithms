package SDA.BinarySearch;

public class BinarySearch {
    private Integer[] array;

    public Integer[] getArray(){
        return array;
    }

    public void generateSortedArray(int length){
        array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
    }

    public int binarySearch(int value){
        return binary(value,0,array.length-1);
    }

    public int binary(int value, int start, int finish){
        if(start > finish)return  -1;
        int pivot = finish - ((finish - start)/2);

        if(value > array[pivot]){
           return binary(value,pivot+1,finish);
        }else if(value < array[pivot]){
           return binary(value,start,pivot-1);
        }else if(value == array[pivot]){
            return pivot;
        }
        return -9999;
    }
    public int linearSearch(int value){

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
        }
        return index;
    }
}
