public class exist_0079 {
    public boolean exist(char[][] board, String word) {
        int len = word.length();
        boolean [][] step = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++ ){
            for (int j = 0 ; j < board[0].length ; j++){
                if(dfs(board,i,j,0,len,step,word) == true){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int i, int j, int word_index, int len,boolean[][] step,String word) {
        //需要让他不能走之前走过的路走过的路boolean型数组设置为true;
        if(word_index == len) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || step[i][j] == true || board[i][j] != word.charAt(word_index)) return false;
        else {
            step[i][j] = true;
        }
        boolean res = dfs(board, i - 1, j, word_index + 1, len, step, word)
                || dfs(board, i + 1, j, word_index + 1, len, step, word)
                || dfs(board, i, j - 1, word_index + 1, len, step, word)
                || dfs(board, i, j + 1, word_index + 1, len, step, word);
        //当我们把ij位置的所有都找完之后，会到这一步，不管成功与否，我们都需要
        //把ij这个位置的可走信息变成false（可走），因为这一步之后，会回溯至上一个位置的
        //另一种路线，而另一种路线是可以走ij这个位置的。
        step[i][j] = false;
        return res;
    }
}
