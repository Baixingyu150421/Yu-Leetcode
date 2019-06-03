package Test;

import java.util.Scanner;

public class Bilibili2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        String str = null;
//        while (sc.hasNext()){
//            num = sc.nextInt();
//            str = sc.next();
//            process(num,str);
//        }
        int n = 2;
        String str = "misakamikotodaisuki";
      ///  System.out.println((char) ((int)'a' - 96));
        process(n,str);
    }

    public static void process(int num , String str){
        int [] hashtable = new int[256];
        String ss = str;
        char[] chars = ss.toCharArray();
        for(int i = 0 ; i < ss.length() ; i++){
            hashtable[(int) ((int) chars[i] - 0)]++;
        }
        int count = 0 ;
        for(int j = 0 ; j < hashtable.length ;j++){
            if(hashtable[j] == 1){
                count++;
                if(count == num){
                    System.out.println("["+ (char)'j' + "]");
                }
            }
        }
        System.out.println("Myon~");
    }
}
