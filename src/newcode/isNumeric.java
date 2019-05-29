package newcode;

public class isNumeric {
    public static void main(String[] args) {
        char[] str =  {'1','a','0'};
        boolean numeric = isNumeric(str);
        System.out.println(numeric);

        System.out.println((byte)'a');
        System.out.println((byte)'z');
        System.out.println((byte)'A');
        System.out.println((byte)'Z');
    }

    //正则表达式
    public boolean isNumeric2(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }

    public static boolean isNumeric(char[] str) {
        boolean falg1 = false;
        boolean falg2 = false;
        for(int i = 0 ; i < str.length ; i++){
            if (str[i] == '.' && falg2 == false){
                falg2 = true;
                continue;
            }
            if (str[i] == '.' && falg2 == true){
                return false;
            }
            if((str[i] == '+' || str[i] == '-') && falg1 == true ){
                return false;
            }
           if((str[i] == '+' || str[i] == '-') && falg1 == false ){
               falg1 = true;
               continue;
           }
            if(str[i] != 'E' && str[i] != 'e' && str[i] < '0' ||str[i] > '9' ){
                String s = String.valueOf(str[i]).toUpperCase();
                if(s.charAt(0) <= 'Z' && s.charAt(0)   >= 'A'   )
                    return false;
            }

           if(str[i] != 'E' && str[i] != 'e' &&  str[i] < '0' && str[i] > '9'){
              return false;
           }else {
               if((str[i] == 'E'  ||  str[i] == 'e') && i == str.length - 1){
                   return true;
               }
               if (str[i] == 'E'  ||  str[i] == 'e' && str[i+1] == '-') {
                   i++;
                   continue;
               }
           }
        }
        return true;
    }
}
