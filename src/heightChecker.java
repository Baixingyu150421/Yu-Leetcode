import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
//1 <= heights.length <= 100
//1 <= heights[i] <= 100
//138周周赛 第一题  完成
public class heightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        heightChecker(heights);
    }
    public static int heightChecker(int[] heights) {
        if(heights == null) return 0;
        int [] arr = new int[heights.length];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
