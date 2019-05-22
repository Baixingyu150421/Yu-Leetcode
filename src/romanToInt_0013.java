//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
//C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
public class romanToInt_0013 {
    public static void main(String[] args) {
        int iii = romanToInt("MCMXCIV");
        System.out.println(iii);
    }
    //罗马数字转整数
    public  static int romanToInt(String s) {
        if(s.length() < 1) return 0;
        int res = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'V'){
                res += 5;
            }else if(s.charAt(i) == 'L'){
                res += 50;
            }else if(s.charAt(i) == 'D'){
                res += 500;
            }else if(s.charAt(i) == 'M'){
                res += 1000;
            }else if(s.charAt(i) == 'I'  ) {
                if(i == s.length() - 1){
                    res += 1;
                    break;}
                if (s.charAt(i + 1) == 'V') {
                    res += 4;
                    i++;
                } else if (s.charAt(i + 1) == 'X') {
                    res += 9;
                    i++;
                }else res += 1;
            }else if(s.charAt(i) == 'X' ){
                if(i == s.length() - 1){
                    res += 10;
                    break;}
                    if(s.charAt(i+1) == 'L'){
                        res += 40;
                        i++;
                    }else if(s.charAt(i+1) == 'C'){
                        res += 90;
                        i++;
                    }else res += 10;
                }else if(s.charAt(i) == 'C'){
                if(i == s.length() - 1){
                    res += 100;
                    break;}
                    if(s.charAt(i+1) == 'D'){
                        res += 400;
                        i++;
                    }else if(s.charAt(i+1) == 'M'){
                        res += 900;
                        i++;
                    }else res += 100;
                }
            }
        return res;
    }
}
