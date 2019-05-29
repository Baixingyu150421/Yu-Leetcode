package newcode;

import java.util.Arrays;


//能不能凑成顺子
public class isContinuous {

    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length < 1) return  false;
        int  ZeroNumber = 0;
        int  MaxValue = 0;
        Arrays.sort(numbers);
        for(int i = 0 ; i < numbers.length - 1 ; i++){
            if(numbers[i] == 0){
                ZeroNumber ++;
                continue;
            }
            //相同的牌直接返回
            if(numbers[i] == numbers[i+1]) return false;
            MaxValue += numbers[i + 1] -  numbers[i]  - 1;
        }
        if(ZeroNumber >= MaxValue)
            return true;
        return false;
    }
}
