package newcode;

import java.util.ArrayList;

public class reOrderArray {
    public static void main(String[] args) {
        int [] array = {1,3,4,5,6,7,8,9};
        reOrderArray(array);
    }
    public static void reOrderArray(int [] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] % 2 != 0){
                list.add(array[i]);
            }
        }
        for (int j = 0 ; j < array.length;j++){
            if(array[j] % 2 == 0){
                list.add(array[j]);
            }
        }
        int k = 0;
        for(Integer a : list) {
            array[k++] = a;
        }
    }
    public static void swap(int [] arr , int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
