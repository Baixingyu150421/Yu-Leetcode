package newcode;

public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) return 0;
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < array[i - 1]){
                return array[i];
            }
        }
        return 0;
    }
}
