package newcode;

import java.util.Arrays;

public class MoreThanHalfNum_Solution01 {
    public static void main(String[] args) {
        int [] array = {1,2,3,2,4,2,5,2,3};
        int i = MoreThanHalfNum_Solution(array);
        System.out.println(i);
    }
    public  static int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        for(int i = 0 ; i < array.length ; i++){
                for(int j = 0; j < array.length; j++){
                    if(array[i] ==array[j]){
                        count++;
                        continue;
                    }
                    continue;
                }
                if(count > (array.length) / 2){
                    return array[i];
                }
                count = 0;
            }
        return 0;

//        int [] arr = new int[array.length];
//        for(int i = 0 ; i < array.length ; i++){
//            arr[array[i] - 'a'] ++;
//        }
//        for(int j = 0 ; j < arr.length ; j++ ){
//            if(arr[j] > (array.length) / 2 ){
//                return array[j + 'a'];
//            }
//        }
//        return 0;
    }
}
