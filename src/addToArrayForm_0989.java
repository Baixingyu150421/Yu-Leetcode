import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
//大数字相加
public class addToArrayForm_0989 {
    public static void main(String[] args) {
//        int [] num = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
//        BigInteger bigInteger = new BigInteger();
        int[] A = {2,7,4};
        List<Integer> list = addToArrayForm(A, 181);
        for(Integer a :list){
            System.out.print(a + " ");
        }
    }
    //A = [], K = 1
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        if(A.length < 1){
            list.add(K);
            return list;
        }
        char[] chars = Integer.toString(K).toCharArray();
        int j = chars.length - 1;
        int i = A.length - 1;
        boolean flag = false;
        for( ; i >= 0; i -- ){
            for( ; j >= 0; ){
                if(A[i] + Integer.parseInt(String.valueOf(chars[j])) >= 10){
                    A[i] = A[i] + Integer.parseInt(String.valueOf(chars[j])) - 10 ;
                    if(i - 1 < 0) {
                        flag = true;
                        break;
                    }
                    A[i - 1] += 1;
                    j--;
                    break;
                }else {
                    A[i] = A[i] + Integer.parseInt(String.valueOf(chars[j]));
                    j--;
                    break;
                }
            }
            if(j < 0){
                break;
            }
        }
        if(flag == true){
            list.add(1);
        }
        int temp = 0;
        while (i>= 2 && A[i- 1] >= 10  ){
            A[i - 1] -=10;
            A[i - 2] += 1;
            i --;
        }
        if(A[0] >= 10){
            A[0] -= 10;
            temp = 1;
            list.add(temp);
        }
        for(Integer a : A){
            list.add(a);
        }
        return list;
    }
}
