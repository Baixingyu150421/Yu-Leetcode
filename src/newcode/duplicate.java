package newcode;

public class duplicate {
    //方法二: 时间复杂度O(N) 空间复杂度O(1)
    public boolean duplicate2(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length < 1) return false;
        for(int i = 0 ; i < length ; i++){
            //出现元素值与索引不符的情况
            while(numbers[i] != i){
                //如果它应当在的位置有与其相同的元素那就说明出现重复元素了
                if(numbers[i] == numbers[numbers[i]]){
                    //保存一下
                    duplication[0] = numbers[i];
                    //返回
                    return true;
                }
                //否则让它到它应该在的位置上去
                swap(numbers,i,numbers[i]);
            }
        }
        return false;
    }
    private void swap(int [] num , int a ,int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

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
