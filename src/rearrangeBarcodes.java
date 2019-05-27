import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class rearrangeBarcodes {
    public static void main(String[] args) {
        int[] barcodes = {1,2,2,2,3,4};
        int[] ints = rearrangeBarcodes(barcodes);

    }
    //周赛未解决
    public static int[] rearrangeBarcodes(int[] barcodes) {
        int start = 0;
        int end = barcodes.length - 1;
        while (start < end){
            swap(barcodes,start++,end--);
        }
        return barcodes;
    }
    public static void swap(int [] arr , int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
