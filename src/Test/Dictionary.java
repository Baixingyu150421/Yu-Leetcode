package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < a ; i++){
                sb.append('a');
            }
            for(int j = 0 ; j < b ; j++){
                sb.append('z');
            }
            ArrayList<String> permutation = Permutation(sb.toString());
            if(c > permutation.size()){
                System.out.println(-1);
            }
            else {
                System.out.println(permutation.get(c - 1));
            }
        }
    }
    public  static ArrayList<String> Permutation(String str) {
        ArrayList<String>  list = new ArrayList<String>();
        if(str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
    public static ArrayList<String> PermutationHelper(char [] ch , int i , ArrayList<String>  list  ){
        if(i  ==  ch.length - 1 ){
            String val = String.valueOf(ch);
            if (!list.contains(val))
                list.add(val);
        }else{
            for(int j = i ; j < ch.length ; j++){
                swap(ch,i,j);
                PermutationHelper(ch,i+1,list);
                swap(ch,i,j);
            }
        }
        return list;
    }
    public static void swap(char [] ch , int a ,int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}
