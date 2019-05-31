package Test;

import java.util.Scanner;

public class city {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //城市个数
        int N = 0;
        //移动次数
        int L = 0;
        int [] parent = null;
        int [] depth = null;
        int maxLength = 0;
        while (scanner.hasNext()){
            N = scanner.nextInt();
            L = scanner.nextInt();
            //
            parent = new int[N - 1];
            for(int i = 0 ; i < parent.length && scanner.hasNext() ; ++ i){
                parent[i] = scanner.nextInt();
                depth[i] = depth[parent[i]] + 1;
                if(depth[i] > maxLength){ maxLength = depth[i];}
            }
            if(maxLength >  L){
                System.out.println(L + 1);
            }else {
                System.out.println((L - maxLength) / 2 + 1 + maxLength);
            }



        }
    }
}
