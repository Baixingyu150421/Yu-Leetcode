package Test;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] score = new int[3];
        int i = 0;
        while (input.hasNext()){
            score[i++] = input.nextInt();
        }
        for(int j = 0 ; j < score.length ; j++){
            if(j == score.length - 1){ System.out.print("score" + (j+ 1) + "=" + score[j] ); break;}
            System.out.print("score" + (j+ 1) + "=" + score[j] + ",");

        }
    }
}
