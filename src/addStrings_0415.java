public class addStrings_0415 {
    public static void main(String[] args) {
        String s = addStrings("9", "99");
        System.out.println(s);
    }

    //两个字符串相加
    public  static  String addStrings(String num1, String num2) {
        StringBuilder builder1 = new StringBuilder(num1).reverse();
        StringBuilder builder2 = new StringBuilder(num2).reverse();
        StringBuilder s3 = new StringBuilder();
        int i = 0 , j = 0 ,add = 0;
        while (i < builder1.length()  || j < builder2.length()){
            int a = i < builder1.length() ? Integer.parseInt(String.valueOf(builder1.charAt(i))) : 0;
            int b = j < builder2.length() ? Integer.parseInt(String.valueOf(builder2.charAt(j))) : 0;
            int res = (  a + b + add)% 10;
            add = (a + b + add) - 10 >= 0 ? 1 : 0;
            s3.append(res);
            if(i < builder1.length()) i++;
            if(j < builder2.length()) j++;
        }
        if(add != 0) s3.append(add);
        return s3.reverse().toString();
    }
}

