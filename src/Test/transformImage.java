package Test;

public class transformImage {
    //翻转对角线 翻转普通的点位
    //不使用额外空间旋转矩阵  N*N
    //思路可以像剥洋葱一样 按圈旋转矩阵
    //规律是前一个行数等于下一个的列数，前一个列数加下一个的行数等于n-1；
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        for(int i = 0  ; i < n / 2 ; i++){
           for(int j = i ; j < n -1 - i ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][i];
                mat[n - 1 -j][i] = mat[n - 1 -i][ n - 1 - j ];
                mat[n - 1 -i][n -1 - j] = mat[j][n - 1 - i];
                mat[j][n - 1 - i] = temp;
           }
        }
        return mat;
    }
}
