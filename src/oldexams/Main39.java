package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String ss = sc.next();
            String[] split = s1.split(",");
            String[] split1 = ss.split(",");
            int [] arr1 = new int[split.length];
            int [] arr2 = new int[split1.length];
            for(int i = 0 ; i < arr1.length ; i++){
                arr1[i] = Integer.parseInt(split[i]);
            }
            for(int j = 0 ; j < arr2.length ; j++){
                arr2[j] = Integer.parseInt(split1[j]);
            }
            int [] arr = new int[arr1.length + arr2.length];
            System.arraycopy(arr1,0,arr,0,arr1.length);
            System.arraycopy(arr2,0,arr,arr1.length,arr2.length);
            Arrays.sort(arr);
            for(int k = 0 ; k < arr.length ; k++){
                System.out.println(arr[k] + ",");
                if(k == arr.length - 1){
                    System.out.println(arr[k]);
                }
            }

//            int index1 = 0;
//            int index2 = 0;
//            int [] arr = new int[arr1.length + arr2.length];
//            int i = 0;
//            while (index1 != arr1.length && index2 != arr2.length){
//                if(arr1[index1] < arr2[index2]){
//                    arr[i++] = arr1[index1++];
//                }else if(arr1[index1] > arr2[index2]){
//                    arr[i++] = arr2[index2++];
//                }else {
//                    arr[i++] = arr1[index1++];
//                }
//            }
//            while (index1 != arr1.length){
//                arr[i++] = arr1[index1++];
//            }
//            while (index2 != arr2.length){
//                arr[i++] = arr2[index2++];
//            }
//            for(int k = 0 ; k < arr.length ; k++){
//                System.out.println(arr[k] + ",");
//                if(k == arr.length - 1){
//                    System.out.println(arr[k]);
//                }
//            }
        }
    }
}
