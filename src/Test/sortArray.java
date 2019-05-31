package Test;

import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 0;
        int [] arr = null;
        int len = 0;
        int line = 0;
        while (input.hasNext()){
            line = input.nextInt();
            for(int i = 0; i < line && input.hasNext(); ++i ){
                len = input.nextInt();
                arr = new int[len];
                for ( ; j < len && input.hasNext(); j++){
                    arr[j++] = input.nextInt();
                }
                int count = 0;
                for(int k = 0 ; k < len ; k++){
                    if(k % 4 == 0){
                        count++;
                    }
                }
                if(count >= len / 2){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
}
