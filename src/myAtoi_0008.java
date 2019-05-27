public class myAtoi_0008 {
    public static void main(String[] args) {
        int i = myAtoi("+");
        System.out.println(i);
    }
    //字符串反转
    public static int myAtoi(String str) {
        if(str == null || str.length() < 1 || str == " ") return 0;
        if(str.length() == 1 && (str == "+" || str == "-")) return 0;
        char[] chars = str.toCharArray();
        int start = 0 ;
        int end = 0;
        char temp = 0;
        boolean falg = false;
        int i = 0 ;
        for(; i < chars.length ; i++){
            if(chars[i] == ' '){
                if(falg == true) {end = i - 1; break;}
                continue;
            }else if(chars[i] == '+' || chars[i] == '-' ){
                if(falg == false){
                    start = i;
                    falg = true;
                    temp = chars[i];
                    continue;
                }
                end = i - 1;
                break;
            }else if((chars[i] < '0' || chars[i] > '9' )  ){
                if(falg == false) return 0;
                end = i - 1;
                break;
            }else if(chars[i] <= '9'  &&  chars[i] >= '0'){
               if(falg == false){
                   start = i;
                   falg = true;
               }
            }
        }
        if(i == chars.length )
            end = chars.length - 1;
        long l = Long.parseLong(str.substring(start, end + 1));
        if(temp == 0 || temp == '+' ){
            if(l > Integer.MAX_VALUE) {return Integer.MAX_VALUE;}
        }
        else if(l < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) l;
    }
}
