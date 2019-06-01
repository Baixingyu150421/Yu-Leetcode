package Test;

import java.util.ArrayList;
public class printMatrix2 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = null;
        int LR = 0;
        int LC = 0;
        int RR = matrix.length - 1;
        int RC = matrix[0].length - 1;
        while(LR <= RR && LC <= RC){
            ArrayList<Integer> list  =  print(matrix,LR++,LC++,RR++,RC++);
            res = list;
        }
        return res;
    }
    public ArrayList<Integer>  print (int [][] arr , int LR , int LC , int RR , int RC ){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(LR == RR){
            while(LC <= RC){
                list.add(arr[LR][LC++]);
            }
            return list;
        }
        else if(LC == RC){
            while(LR <= RR){
                list.add(arr[LR++][LC]);
            }
            return list;
        }
        else{
            int curR = LR;
            int curC = LC;
            while(curC != RC){
                list.add(arr[LR][curC]);
                curC++;
            }
            while(curR != RR){
                list.add(arr[curR][RC]);
                curR++;
            }
            while(curC != LC){
                list.add(arr[RR][curC]);
                curC--;
            }
            while(curR != LR){
                list.add(arr[curR][LC]);
                curR --;
            }
            return list;
        }
    }
}
