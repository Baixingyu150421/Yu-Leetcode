package Test;

public class findMaxDivision {
    public int findMaxDivision(int[] A, int n) {
        // write code here
        //这里使用桶排序
        int max = A[0];
        int min = A[0];
        for(int i = 0 ; i < A.length ; i++){
            max = Math.max(max,A[i]);
            min = Math.min(min,A[i]);
        }
        //新建桶
        int [] arr = new int[max - min + 1];
        for(int i = 0 ; i < A.length ;i++){
            arr[A[i] - min] ++;
        }
        int count = 0;
        int res = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                count++;
            }
            else {
                    res = Math.max(res, count);
                    count = 0;
            }
        }
        return res + 1;
    }
}
