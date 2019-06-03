package vivo;

import java.util.LinkedList;
import java.util.Scanner;
//约瑟夫环
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1 ; i <= n ; i++){
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1){
            index = (index + m - 1 ) %   list.size();
            System.out.println(list.get(index));
            list.remove(index);
        }
        if(list.size() != 0){
            System.out.println(list.get(0));
        }
    }
}

