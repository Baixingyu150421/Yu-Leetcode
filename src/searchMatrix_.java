public class searchMatrix_ {
    //法1：暴力遍历
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1) return false;
        int x = matrix.length;
        int y = matrix[0].length;
        for(int i = 0 ; i < x; i++){
            for(int j = 0 ; j < y ; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
