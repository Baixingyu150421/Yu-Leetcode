import java.util.Arrays;
import java.util.PriorityQueue;

//有一堆石头，每块石头的重量都是正整数。
//
//每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
//
//如果 x == y，那么两块石头都会被完全粉碎；
//如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
//最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
public class lastStoneWeight_5063 {
    public static void main(String[] args) {
        int [] num = {7,6,7,6,9};
        int i = lastStoneWeight(num);
        System.out.println(i);
    }
   //使用优先级队列，定义比较规则
    public int lastStoneWeight2(int[] stones) {
            PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->b-a);
            for(int stone : stones) q.offer(stone);
            while(q.size()>=2){
                int x=q.poll(), y=q.poll();
                if(x!=y) q.offer(Math.abs(x-y));
            }
            return q.isEmpty()? 0 : q.poll();
    }

    //递归
    public  static int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        if(stones.length == 0) return 0;
        Arrays.sort(stones);
        if(stones[stones.length - 1] == 0 && stones[stones.length - 2] == 0){
            return 0;
        }else if(stones[stones.length - 2] == 0 && stones[stones.length - 1]!=0){
            return stones[stones.length - 1];
        }
        if(stones[stones.length -1] == stones[stones.length - 2]){
            stones[stones.length - 1] = 0;
            stones[stones.length - 2] = 0;
            return lastStoneWeight(stones);
        }
        stones[stones.length - 2] = stones[stones.length -1] - stones[stones.length - 2];
        stones[stones.length - 1] = 0;
        return lastStoneWeight(stones);
    }
}
