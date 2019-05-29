package newcode;

public class multiply {

    public static void main(String[] args) {
        int [] A = {1,2,3,4};
        int[] multiply = multiply(A);
        for(int a : multiply){
            System.out.print(a + " ");
        }
    }
    //构建乘积数组
    public static int[] multiply(int[] A) {
        int [] B = new int[A.length];
        B[0] = 1;
        for(int i = 1 ; i < A.length ; i++){
            B[i] = B[i -1]  * A[i -1];
        }
        int [] C = new int[A.length];
        C[C.length - 1] = 1;
        for(int j = B.length - 2 ; j >= 0  ; j--){
            C[j] = C[j + 1] * A[j+1];
        }
        int [] res = new int[A.length];
        for(int i = 0 ; i < A.length ; i++){
            res[i] = B[i] * C[i];
        }
        return res;
    }
}
