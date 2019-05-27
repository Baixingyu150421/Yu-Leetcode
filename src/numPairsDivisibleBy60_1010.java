import java.util.HashMap;

public class numPairsDivisibleBy60_1010 {
    public static void main(String[] args) {
        int [] time = {60,60,60};
        int i = numPairsDivisibleBy602(time);
        System.out.println(i);
    }
    //音乐播放 使用hash表
    public static int numPairsDivisibleBy602(int[] time) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < time.length ; i ++){
            int key = time[i] % 60;
            if(map.containsKey(key)){
                count = map.get(key);
            }
            map.put(key,map.containsKey(key)? map.get(key) + 1: 1);
        }
        return count;
    }


    //时间复杂度超出限制
    public static int numPairsDivisibleBy60(int[] time) {
        if(time.length < 2) return 0;
        int slow = 0;
        int fast = 1;
        int count = 0;
        while(fast < time.length && slow < time.length){
            if((time[slow] + time[fast]) % 60 == 0 && slow < fast){
                if(fast == time.length - 1 && slow < fast){
                    slow++;
                    fast = slow ;
                }
                count++;
                fast++;
            }else if((time[slow] + time[fast]) % 60 != 0 && slow < fast){
                if(fast == time.length - 1 && slow < fast){
                    slow++;
                    fast = slow ;
                }
                fast++;
            }
        }
        return count;
    }
}
