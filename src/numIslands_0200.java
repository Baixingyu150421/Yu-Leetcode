/**
 * 2019-05-08  深度优先遍历
 */
public class numIslands_0200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        //遍历二维数组
        for(int i = 0 ; i < grid.length ; i ++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    //遇到1就把与它相邻的1变为0 count++
                    count ++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid , int i , int j){
        if(i >=0 && i < grid.length && j >= 0 && j < grid[0].length){
            if(grid[i][j] == '1'){
                grid[i][j] = '0';
                dfs(grid,i,j+1);
                dfs(grid,i,j-1);
                dfs(grid,i+1,j);
                dfs(grid,i-1,j);
            }
        }
    }
}
