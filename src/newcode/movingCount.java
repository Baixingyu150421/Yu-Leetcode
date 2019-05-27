package newcode;

public class movingCount {
    public static void main(String[] args) {
//        int i = int2sum(124);
//        System.out.println(i);
       // int count = movingCount(5, 6, 6);

    }
    public int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols]; //记录是否已经走过
        return helper(0, 0, rows, cols, flag, threshold);
    }

    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || int2sum(i) + int2sum(j)  > threshold || flag[i][j] == 1) return 0;
        flag[i][j] = 1;
        return helper(i - 1, j, rows, cols, flag, threshold)
                + helper(i + 1, j, rows, cols, flag, threshold)
                + helper(i, j - 1, rows, cols, flag, threshold)
                + helper(i, j + 1, rows, cols, flag, threshold)
                + 1;
    }
    public static int int2sum(int a){
        char[] chars = Integer.toString(a).toCharArray();
        int res = 0;
        for(int i = 0 ; i < chars.length ; i++ ){
            res += Integer.parseInt(String.valueOf(chars[i]));
        }
        return res;
    }

}
