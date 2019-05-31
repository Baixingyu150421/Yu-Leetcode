package Test;

public class replaceSpace {
    public String replaceSpace(String iniString, int length) {
        StringBuilder sb = new StringBuilder();
        char[] chars = iniString.toCharArray();
        for(int i = 0 ; i < length ; i++){
            if(chars[i] == ' '){
                sb.append("%20");
            }else{
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
