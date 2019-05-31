package Test;

public class formatString {
    public static void main(String[] args) {
        //"A%sC%sE",7,['B','D','F']
        String A = "A%sC%sE";
        int n = 7;
        char[] arg = {'B','D','F'};
        int m = 3;
        String s = formatString(A, n, arg, m);

    }
    //字符串替换
    public static String formatString(String A, int n, char[] arg, int m) {
        // write code here
        int j = 0;
        StringBuilder  sb = new StringBuilder();
        for(int i = 0; i < n ; i++){
            if(A.charAt(i) == '%' && A.charAt(i+1) == 's'){
                sb.append(String.valueOf(arg[j]));
                j++;
                i++;
            }
            else {
                sb.append(String.valueOf(A.charAt(i)));
            }
        }
        while(j < m){
            sb.append(String.valueOf(arg[j]));
            j++;
        }
        return sb.toString();
    }
}
