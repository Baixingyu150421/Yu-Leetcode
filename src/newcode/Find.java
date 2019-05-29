package newcode;

public class Find {
    public static void main(String[] args) {
        int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 7;
        boolean find = Find(target, array);
        System.out.println(find);
    }
    public static boolean Find(int target, int [][] array) {
            for(int i = 0 ; i < array.length ; i++){
                for(int j = array[0].length - 1 ; j >= 0 ; j--){
                    if(array[i][j] == target){
                        return true;
                    }
                    if(array[i][j] > target){
                        continue;
                    }
                    else if(array[i][j] < target){
                       break;
                    }
                }
            }
            return false;
    }
}
