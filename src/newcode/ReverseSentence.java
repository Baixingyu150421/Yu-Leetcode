package newcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = ReverseSentence("I am a student.");
        System.out.println(s);
    }
    public  static String ReverseSentence(String str) {
        int start = 0;
        List<String> strings = new ArrayList<>();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' '){
                strings.add(str.substring(start,i));
                start = i + 1;
            }
        }
        String substring = str.substring(start, str.length());
        StringBuilder stringBuilder = new StringBuilder();
        if(strings.size() > 0){
            stringBuilder.append(substring).append(" ");
        }
        for (int i = strings.size() - 1 ; i >= 0 ; i--){
            stringBuilder.append(strings.get(i));
            if(i != 0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
