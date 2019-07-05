import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class findKthLargest_0215 {
    public static void main(String[] args) {
        //[3,2,1,5,6,4] 和 k = 2
        int [] num= {3,2,3,1,2,4,5,5,6};
        int kthLargest = findKthLargest2(num, 4);
        System.out.println(kthLargest);
    }
    //使用库函数
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(int i = 0 ; i < nums.length ; i++){
            if(queue.size() < k){
                queue.add(nums[i]);
            }else if(nums[i] > queue.peek()){
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }


    //堆排序（正解） 插入的时间复杂度O(logN)
    public static int findKthLargest1(int[] nums, int k) {
//        int max = nums[0];
//        for(int i = 0 ; i < nums.length ; i++){
//            for(int j = i + 1 ; j < nums.length ; j++){
//                if(nums[j] > max){
//                    max = nums[j];
//                }
//            }
//        }
        return 0;
    }
}
