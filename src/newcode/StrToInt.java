package newcode;

public class StrToInt {
    public static void main(String[] args) {
        int i = StrToInt("123");
        System.out.println(i);
    }
    public  static int StrToInt(String str) {
        if(str == null || str.length() < 1) return 0;
        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        char temp = '0';
        for(int i = 0 ; i < chars.length ; i++ ){
            if(chars[i] == '+' || chars[i] == '-'){
                temp = chars[i];
                continue;
            }
            if(chars[i] < '0' || chars[i] > '9'){
                return 0;
            }
            builder.append(chars[i]);
        }
        String s = builder.toString();
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            long res = 1;
            for(int j = i +  1 ; j < s.length() ; j++){
                   res*=10;
            }
            res = res * Integer.parseInt(s.substring(i,i+1));
            if(res > Integer.MAX_VALUE){
                return 0;
            }
            sum +=res;
        }
        if(temp == '0' || temp == '+'){
            return sum;
        }
        return -sum;
    }
}
