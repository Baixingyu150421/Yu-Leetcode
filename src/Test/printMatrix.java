package Test;

public class printMatrix {
    public int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
        int [] res = new  int[n * m ];
        int index = 0;
        for(int i = 0 ; i < mat.length ; i++){
            if(i % 2 == 0) {
                for (int j = 0; j < mat[0].length; j++) {
                    res[index++] = mat[i][j];
                }
            }else {
                for(int k = mat[0].length - 1; k >= 0 ; k--){
                    res[index++] = mat[i][k];
                }
            }
        }
        return res;
    }
}
