package newcode;

public class multiply {
    public static void main(String[] args) {
        int [] A = {1,2,3,4};
        int[] multiply = multiply(A);
        for(int a : multiply){
            System.out.print(a + " ");
        }
    }
    public static int[] multiply(int[] A) {
        int [] B = new int[A.length];
        B[0] = A[0];
        int i = 1;
        while (i < A.length){
            B[i] = B[i-1] * A[i];
            i++;
        }
        return B;
    }
}
