package Test;

public class flipChess {
    //[[0,1,0,0],[1,0,1,0],[1,1,0,0],[1,0,0,1]],[[2,3],[4,2],[2,3]]

    public static void main(String[] args) {
        int [][] A = {
                {0,1,0,0},
                {1,0,1,0},
                {1,1,0,0},
                {1,0,0,1}
        };
        int[][] f = {
                {2,3},
                {4,2},
                {2,3}
        };
        int[][] ints = flipChess(A, f);

    }


    public static int[][] flipChess(int[][] A, int[][] f) {
        // write code here
        for(int x = 0 ; x < f.length ; x++){

            int a = f[x][0] - 1 ;
            int b = f[x][1] - 1;
            if( a - 1 >= 0   ){
                A[a - 1][b] = A[a - 1][b] == 1 ? 0 : 1;
            }
            if(a + 1 <= 3  ){
                A[a + 1][b] = A[a + 1][b] == 1 ? 0 : 1;
            }
            if(  b - 1 >= 0){
                A[a ][b - 1] = A[a ][b - 1] == 1 ? 0 : 1;
            }
            if( b + 1 <= 3){
                A[a ][b + 1] = A[a ][b + 1] == 1 ? 0 : 1;
            }

        }
        return A;
    }
}
