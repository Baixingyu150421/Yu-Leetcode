package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String [] strings = {"car","cat","dog","koala","carr"};
//        Arrays.sort(strings);
//        for(String s : strings){
//            System.out.print(s + " ");
//        }
        while (sc.hasNext()){
            int n = sc.nextInt();
            String [] str = new String[n];
            String [] str2 = new String[n];
            for(int i = 0 ; i < n ; i ++){
                str2[i] = str[i] = sc.next();
            }
            Arrays.sort(str2);
            boolean isDictionary = false;
            int i = 0;
            for(; i < n ; i++){
                if(str[i] != str2[i]){
                    isDictionary = false;
                    break;
                }
            }
            if(i == n){
                isDictionary = true;
            }
            boolean isLength = false ;
            int j = 0;
            for( ; j < str.length - 1 ; j++) {
                if(str[j].length() > str[j + 1].length()){
                    isLength = false;
                    break;
                }
            }
            if(j == n - 1){
                isLength = true;
            }
            if(isDictionary && isLength){
                System.out.println("both");
            }else if(isDictionary){
                System.out.println("lexicographically");
            }else if(isLength){
                System.out.println("lengths");
            }else {
                System.out.println("none");
            }
        }
    }
}
