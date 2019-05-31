package Test;

public class checkDifferent {
    public boolean checkDifferent(String iniString) {
        //正则表达式：return !iniString.matches(".*(.)(.*\\1).*"); 匹配出现重复的字符串
        // write code here  检查一个字符串中的重复字符 不使用额外空间
        if(iniString.length() > 256)return false;
        for(int i = 0 ; i < iniString.length() ; i++){
            for(int j = i + 1 ; j < iniString.length() ; j++){
                if(iniString.charAt(i) == iniString.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
