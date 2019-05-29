package newcode;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String>  list = new ArrayList<String>();
        if(str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
    public ArrayList<String> PermutationHelper(char [] ch , int i , ArrayList<String>  list  ){
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
    public void swap(char [] ch , int a ,int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}
