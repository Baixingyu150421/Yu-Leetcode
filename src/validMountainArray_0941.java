import java.util.Arrays;

public class validMountainArray_0941 {
    public static void main(String[] args) {
        boolean b = validMountainArray(new int[]{3,5,5});
        System.out.println(b);
    }
    public static boolean validMountainArray(int[] A) {
        int  max = Integer.MIN_VALUE;
        if(A.length == 0 || A == null ) return false;
        if(A.length == 1) return true;
        for(int i = 0 ; i < A.length ; i++){
            max = Math.max(max,A[i]) ;
        }
        int index = 0;
        if(A[0] > A[1]) return false;
        for(int i = 0 ; i < A.length - 1 ; i++){
            if(A[i] < A[i+1]){
                continue;
            }else if(A[i] == max){
                index = i;
                break;
            }else {
                return false;
            }
        }
        for(int j = index ; j < A.length - 1 ;j++){
            if(A[j] <= A[j+1]){
                return false;
            }
        }
        return true;
    }
}
