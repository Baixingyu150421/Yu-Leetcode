package newcode;

import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < array.length ; i++ ){
            int target = sum - array[i];
            for(int j = i + 1 ;j < array.length ; j++){
                if(target == array[j]){
                    list.add(array[i]);
                    list.add(array[j]);
                    return list;
                }else {
                    continue;
                }
            }
        }
        return null;
    }
}
