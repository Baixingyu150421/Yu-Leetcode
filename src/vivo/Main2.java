package vivo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //输入一组数据并输出
//        Scanner sc = new Scanner(System.in);
//        String str=sc.nextLine();
//        System.out.printf("%s\n",str);

        //输入多组数据并输出
        Scanner sc = new Scanner(System.in);
        String str;
        while(sc.hasNextLine()){
            str = sc.nextLine();
            System.out.printf("%s\n",str);
        }
    }
}
