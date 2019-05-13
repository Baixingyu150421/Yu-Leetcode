public class rotate_0048 {
    public static void main(String[] args) {
        int [][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(nums);
        for(int i = 0 ; i < nums.length ;i++ ){
            for(int  j = 0 ; j < nums[0].length ; j++){
                System.out.print(nums[i][j] + " ");
            }
        }
    }

    /**
     * 旋转图像
     * @param matrix
     */
    public  static  void rotate(int[][] matrix) {
        int start = 0;
        int end = matrix[0].length - 1;
        //没有圈，或者只剩中心点了 终止
        while(start < end){
            for(int i = 0 ; i< end - start ; i++){
                //找到坐标变换的规律
                swap(matrix,start,start+i,end-i,start);
                swap(matrix,end-i,start,end,end-i);
                swap(matrix,end,end-i,start + i ,end);
            }
            //缩圈
            start++;
            end--;
        }
    }
    //交换函数
    public static void swap (int[][] num ,int x1, int y1 ,int x2 ,int y2){
        int temp = num[x1][y1];
        num[x1][y1] = num[x2][y2];
        num[x2][y2] = temp;
    }
}
