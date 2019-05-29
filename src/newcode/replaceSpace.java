package newcode;

public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for(int index = 0 ; index < str.length() ; index++){
            if(str.charAt(index) == ' '){
                sb.append("%20");
            }else {
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }
}
