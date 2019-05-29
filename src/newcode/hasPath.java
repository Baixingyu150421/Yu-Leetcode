package newcode;

public class hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean [] path = new boolean[matrix.length];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(find(matrix,i,j,rows,cols,path,str,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find(char [] matrix , int i , int j , int rows , int cols ,boolean [] path,char [] str , int index){
        int falg = i * cols + j;
        //递归终止条件
        if(i < 0 || j < 0 || i >= rows || j >= cols || matrix[falg] != str[index] ||  path[falg] == true) return false;
        if(index == str.length - 1) return true;
        path[falg] = true;
        if(find(matrix,i+1,j,rows,cols,path,str,index+1) ||
           find(matrix,i-1,j,rows,cols,path,str,index+1) ||
           find(matrix,i,j+1,rows,cols,path,str,index+1) ||
           find(matrix,i,j-1,rows,cols,path,str,index+1)
        ){
            return true;
        }
        path[falg] = false;
        return false;
    }
}
