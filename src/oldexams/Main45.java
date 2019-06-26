package oldexams;

import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //平年
        int [] arr1 = {31,28,31,30,31,30,31,31,30,31,30,31};
        //闰年
        int [] arr2 = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        while (sc.hasNext()){
            int Y = sc.nextInt();
            int M = sc.nextInt();
            int D = sc.nextInt();
            //是闰年
            if((Y % 4 == 0 && Y % 100 != 0 ) || (Y % 400 == 0)){
                for(int j = 0 ; j < M - 1 ; j++){
                    sum += arr2[j];
                }
                sum += D;
                System.out.println(sum);
            }else {
                for(int j = 0 ; j < M - 1; j++){
                    sum += arr1[j];
                }
                sum += D;
                System.out.println(sum);
            }
        }
    }
}
