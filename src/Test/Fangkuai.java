package Test;

import java.util.Scanner;

public class Fangkuai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //多少列
        int n = 0;
        //数组有多少元素
        int m = 0;
        while (input.hasNext()){
            n = input.nextInt();
            m = input.nextInt();
            //第i个元素落在第几列
            int [] arr = new int[m];
            for(int i = 0 ; i < m ; i ++){
                arr[i] = input.nextInt();
            }
            int [] hashTable = new int[n];
            for(int i = 0 ; i < arr.length ; i++){
               hashTable[arr[i] - 1] ++;
            }
            int type = 0;
            int min =  Integer.MAX_VALUE;
            for(int i = 0 ; i < hashTable.length ; i++){
                if(hashTable[i] != 0){
                    type++;
                }else {
                    min = Math.min(min,hashTable[i]);
                }
            }
            if(type < n){
                System.out.println(0);
            }else {
                System.out.println(min);
            }
        }
    }
}
