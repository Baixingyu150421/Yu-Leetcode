public class checkRecord_0551 {
    public static void main(String[] args) {
        boolean ppallp = checkRecord("PPAALLLPL");
        System.out.println(ppallp);
    }
    //如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
    public static boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int num_A = 0;
        int num_L = 0;
        boolean flag = false;
        for(int i = 0 ; i < chars.length ; i++){
            if(chars[i] == 'A'){
                num_A++;
                if(num_A > 1){
                    return false;
                }
                flag =false;
            }else if(chars[i] == 'L'){
                if(flag == false){
                    num_L = 1;
                    flag = true;
                }else {
                    num_L++;
                }
                if(num_L > 2){
                    return false;
                }
                flag = true;
            }else if(chars[i] == 'P'){
                flag =false;
            }
        }
        if(num_A <= 1 && num_L <= 2 ){
            return true;
        }
        return false;
    }
}
