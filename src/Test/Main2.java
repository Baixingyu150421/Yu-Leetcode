package Test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R2 = input.nextInt();
        double sqrt = Math.sqrt(R2);
        String string = Double.toString(sqrt);
        int i1 = string.indexOf(".");
        if(string.charAt(i1 + 1) != '0') System.out.println(4);
        int count = 0;
        for(int i = 1 ; i < sqrt ; i++ ){
            for(int j = 1 ; j < sqrt ; j++){
                if((i * i) +  (j * j) == R2){
                    count++;
                }else if((i * i) +  (j * j) < R2){
                    continue;
                }else {
                    break;
                }
            }
        }
        System.out.println(4 + count * 2);
    }
}
