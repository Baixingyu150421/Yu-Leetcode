import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Comparator;

public class largestNumber_0179 {
    public static void main(String[] args) {
        int [] num = {34,3,1,9,2};
        String s = largestNumber(num);

    }
    //最大的数字组合
    public  static String largestNumber(int[] nums) {
            String[]s = new String[nums.length];
            for(int i = 0;i < nums.length;i++)
                s[i] = ""+nums[i];
            Arrays.sort(s, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    //默认升序 -表示降序
                    return -(o1+o2).compareTo(o2+o1);
                }
            });

            if(s[0].equals("0"))return "0";
            String ans = "";
            for(int i = 0;i < s.length;i++)
                ans += s[i];
            return ans;
        }

}
