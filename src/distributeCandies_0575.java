import java.util.HashSet;
import java.util.Set;

public class distributeCandies_0575 {
    public static void main(String[] args) {
        int [] num = {1,1,2,3};
        int i = distributeCandies(num);
        System.out.println(i);
    }
    ////超过一半不重样的糖果也只能拿到一半  ，否则就是糖果数
    public static  int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < candies.length ;i++ ){
            set.add(candies[i]);
        }
        return Math.min(set.size(),(candies.length /2));
    }
}
