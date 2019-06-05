package newcode;

import java.util.ArrayList;

public class printMatrix {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC){
            print(matrix, tR++, tC++, dR--, dC--);
        }
        return list;
    }

    public ArrayList<Integer> print(int [][] matrix,int tR ,int tC , int dR ,int dC){
        //只有一行

        if(tR == dR){
            while (tC <= dC){
                list.add(matrix[tR][tC]);
                tC++;
            }
            return list;
        }
        //只有一列
        else if(tC == dC){
            while (tR <= dR){
                list.add(matrix[tR][tC]);
                tR++;
            }
            return list;
        }
        //正常情况
        else {
            int curC = tC;
            int curR = tR;
            while (curC != dC ){
                list.add(matrix[tR][curC]);
                curC++;
            }
            while (curR != dR){
                list.add(matrix[curR][dC]);
                curR++;
            }
            while (curC != tC){
                list.add(matrix[dR][curC]);
                curC--;
            }
            while (curR!=tR){
                list.add(matrix[curR][tC]);
                curR--;
            }
            return list;
        }
    }
}
