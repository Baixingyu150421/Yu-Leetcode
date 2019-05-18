import java.util.ArrayList;
import java.util.List;

public class majorityElement_0229 {
    //求众数，摩尔投票法 感觉像是贪心算法  可以推广到 n/k
    // 拿这题来说超过3/n的数至多有两个，
    // 至少有一个 ，所以定义两个不同的数，和计数器进行投票
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length < 1) return list;
        if(nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        //选两个数进行投票
        int a = nums[0];
        int b = nums[1];
        //计数器
        int countA = 0;
        int countB = 0;
        //第一次遍历选出候选人
        for(int i = 0 ; i < nums.length ; i ++){
            //两个不同的数
            if(countA == 0 && nums[i] != b){
                a = nums[i];
            }else if(countB == 0 && nums[i] != a){
                b = nums[i];
            }
            if(nums[i] == a){
                countA ++;
            }
            else if(nums[i] == b && a != b){
                countB++;
            }else{
                countA--;
                countB--;
            }
        }
        countA = 0;
        countB = 0;
        for(Integer k : nums){
            if(k == a){
                countA ++;
            }else if(k == b){
                countB ++;
            }
        }
        if(countA > nums.length / 3){
            list.add(a);
        }
        if(countB > nums.length / 3){
            list.add(b);
        }
        return list;
    }
}
