package newcode;

import java.util.Vector;

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null) return false;
        if(sequence.length == 1) return true;
        return Verify(sequence,0,sequence.length - 1);
    }
    public boolean Verify(int [] arr, int start ,int end){
        //只有右子树
        if(arr[start] > arr[end]){
            return true;
        }
        int i = start;
        //找到左子树的截止位置
        while (arr[i] < arr[end]){
            i++;
        }
        //右子树必须大于根节点
        for(int j = i ; j < end ; j++){
            if(arr[j] < arr[end]){
                return false;
            }
        }
        //分治
        return Verify(arr,start,i-1) && Verify(arr,i,end-1);
    }
}
