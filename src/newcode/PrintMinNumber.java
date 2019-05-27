package newcode;

import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        String [] str = new String[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            str[i] = Integer.toString(numbers[i]);
            Arrays.sort(str, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    //升序
                    return (o1 + o2).compareTo(o2+o1);
                }
            });
        }
        int k = 0;
        while (str[k] == "0"){
            k++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(; k < str.length ; k++){
            stringBuilder.append(str[k]);
        }
        return stringBuilder.toString();
    }
}
