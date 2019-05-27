package newcode;

public class duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length < 1) return false;
        int [] newArr = new int[length];
        for(int i = 0 ; i < numbers.length ; i++){
            newArr[numbers[i] - 0]++;
        }
        for(int i = 0 ; i < newArr.length ; i++ ){
            if(newArr[i] > 1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
