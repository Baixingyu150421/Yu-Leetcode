package newcode;

import java.util.HashMap;

public class FindNumsAppearOnce {
    public static void main(String[] args) {
        int [] array = {2,4,3,6,3,2,5,5};
        int [] num1 = new int[1];
        int [] num2 = new int[1];
        FindNumsAppearOnce(array,num1,num2);
    }
    public  static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < array.length ; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+ 1);
                continue;
            }
            map.put(array[i],1);
        }
        boolean flag = false;
        for(int i = 0 ; i < array.length; i++){
            if(map.get(array[i]) == 1){
                if(flag == true){
                    num2[0] = array[i];
                    continue;
                }
                num1[0] = array[i];
                flag = true;
            }
        }
    }
}
