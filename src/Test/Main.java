package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 0;
        int M = 0;
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            N = input.nextInt();
            M = input.nextInt();
            int [] number = new int[N];
            for (int i = 0 ;i < N && input.hasNext() ; i++){
                number[i] = input.nextInt();
            }
            String type = null;
            for (int j = 0 ; input.hasNext() && j < M ; j++ ){
                type = input.next();
                a = input.nextInt();
                b = input.nextInt();
                MaxGrade(type, a, b,number);

            }
        }
    }
    public static void MaxGrade(String type , int a ,int b,int [] arr){
        int result = 0;
        int start;
        int end;
        if(type.equals("Q")){
            start = Math.min(a,b) - 1;
            end = Math.max(a,b);
            for( int i = start; i < end ; i ++ ){
                if(result < arr[i]){
                    result = arr[i];
                }
            }
            System.out.println(result);
        }else if(type.equals("U")){
            arr[a - 1] = b;
        }
    }
}
