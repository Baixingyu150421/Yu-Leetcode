package Test;

public class rotateMatrix {
    //矩阵顺时针旋转90度
    public int[][] rotateMatrix(int[][] mat, int n) {
        int [][]temp = new int[n][n];
        for(int i = 0 ; i < mat.length ; i++){
            for(int j= 0 ; j < mat[0].length ; j++){
                //坐标变换规律
                temp[j][n - i - 1] = mat[i][j];
            }
        }
        return temp;
        // write code here
    }
}
